package org.example;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Propiedades {
    public static void main(String[] args) {
        escribe();
        leer();
    }

    private static void leer() {
        try {
            FileReader fileReader = new FileReader("configuracion.properties");
            Properties properties = new Properties();

            properties.load(fileReader);

            String ip = properties.getProperty("IP");
            System.out.println("IP: " + ip);
            String dns = properties.getProperty("dns", "8.8.8.8");
            System.out.println("IP: " + ip + ", DNS: " + dns);
            String user = properties.getProperty("user");
            String pass = properties.getProperty("pass");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void escribe() {
        try {
            FileWriter fileWriter = new FileWriter("configuracion.properties");
            Properties properties = new Properties();

            properties.setProperty("IP", "192.168.50.254");
            properties.setProperty("user", "root");
            properties.setProperty("pass", "1234");


            properties.store(fileWriter, "propiedades para la app");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
