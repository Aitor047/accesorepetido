package Ejercicio2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.StringTokenizer;

public class Ej2 {
    public static void main(String[] args) {
        //conRegex();
        normal();
    }

    private static void normal() {
        Path inputPath = Paths.get("input.txt");
        Path enterosPath = Paths.get("integer.txt");
        Path floatPath = Paths.get("float.txt");
        Path stringPath = Paths.get("string.txt");

        try(BufferedReader bf = Files.newBufferedReader(inputPath);
            BufferedWriter intWriter = Files.newBufferedWriter(enterosPath);
            BufferedWriter floatWriter = Files.newBufferedWriter(floatPath);
            BufferedWriter stringWriter = Files.newBufferedWriter(stringPath)) {

            String linea;
            while ((linea = bf.readLine()) != null) {
                StringTokenizer tokenizer = new StringTokenizer(linea);
                while (tokenizer.hasMoreTokens()){
                    String token = tokenizer.nextToken();
                    
                }
            }

        } catch (IOException e) {
            e.getLocalizedMessage();
        }
    }

    private static void conRegex() {
        Path inputPath = Paths.get("input.txt");
        Path enterosPath = Paths.get("integer.txt");
        Path floatPath = Paths.get("float.txt");
        Path stringPath = Paths.get("string.txt");

        try(BufferedReader bf = Files.newBufferedReader(inputPath);
            BufferedWriter intWriter = Files.newBufferedWriter(enterosPath);
            BufferedWriter floatWriter = Files.newBufferedWriter(floatPath);
            BufferedWriter stringWriter = Files.newBufferedWriter(stringPath)) {

            String linea;
            while ((linea = bf.readLine()) != null) {
                String[] tokens = linea.split(" ");
                for (String token : tokens) {
                    if (token.matches("-?\\d+")){
                        //NUMEROS
                        //System.out.println(token);
                        intWriter.write(token + System.lineSeparator());
                    } else if (token.matches("-?\\d+.\\d+")) {
                        //FLOAT
                        //System.out.println(token);
                        floatWriter.write(token + System.lineSeparator());
                    } else {
                        //STRINGS
                        //System.out.println(token);
                        stringWriter.write(token + System.lineSeparator());
                    }
                }
            }

        } catch (IOException e) {
            e.getLocalizedMessage();
        }
    }
}
