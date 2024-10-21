package org.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropiedadesXML {
    public static void main(String[] args) {
        //escribe();
        leer();
    }

    private static void leer() {
        try {
            FileInputStream fileInputStream = new FileInputStream("configuracion.xml");
            Properties properties = new Properties();

            properties.loadFromXML(fileInputStream);

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
            FileOutputStream fileOutputStream = new FileOutputStream("configuracion.xml");
            Properties properties = new Properties();

            properties.setProperty("IP", "192.168.50.254");
            properties.setProperty("user", "root");
            properties.setProperty("pass", "1234");


            properties.storeToXML(fileOutputStream, "propiedades para la app");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
