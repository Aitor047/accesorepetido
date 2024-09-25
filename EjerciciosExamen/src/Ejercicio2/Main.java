package Ejercicio2;

import java.io.*;
import java.nio.Buffer;

public class Main {
    public static void main(String[] args) {
        String archivoOriginal = "archivoOriginal.txt";
        String archivoReemplazado = "archivoReemplazado.txt";
        String cadenaBuscar = "Wikipedia";
        String cadenaReemplazar = "Adios";

        BuscarYRemplazar(archivoOriginal, archivoReemplazado, cadenaBuscar, cadenaReemplazar);
    }

    private static void BuscarYRemplazar(String archivoOriginal, String archivoReemplazado, String cadenaBuscar, String cadenaReemplazar) {
        try (BufferedReader reader = new BufferedReader(new FileReader(archivoOriginal));
             BufferedWriter writer = new BufferedWriter(new FileWriter(archivoReemplazado))
        ){
            String linea;
            while ((linea = reader.readLine()) != null) {
                String lineaModificada = linea.replace(cadenaBuscar, cadenaReemplazar);
                writer.write(lineaModificada);
                writer.newLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
