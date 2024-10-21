package Ejercicio1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Path logsDir = Paths.get("Logs");
        Path processedDir = Paths.get("Processed");
        Path errorDir = Paths.get("Error");

        createDirifNotExist(processedDir);
        createDirifNotExist(errorDir);

        try(Stream<Path> paths = Files.walk(logsDir)) {
            paths.filter(Files::isRegularFile).forEach(file -> {
                System.out.println(file.getFileName());
                try {
                    boolean hasError = Files.lines(file).allMatch(line -> line.contains("ERROR"));

                    if (hasError){
                        System.out.println("Tiene error en el fichero " + file.getFileName());
                        Files.move(file, errorDir.resolve(file.getFileName()), StandardCopyOption.REPLACE_EXISTING);
                    } else {
                        System.out.println("No tiene error en el fichero " + file.getFileName());
                        Files.move(file, processedDir.resolve(file.getFileName()), StandardCopyOption.REPLACE_EXISTING);
                    }

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static void createDirifNotExist(Path pathDir) {
        if (!Files.exists(pathDir)) {
            try {
                Files.createDirectory(pathDir);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {

        }
    }
}
