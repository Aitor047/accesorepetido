package Ejercicio2;

import Ejercicio1.Fruta;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Ejercicio1.Fruta naranja = new Ejercicio1.Fruta("Naranja", "Naranja");
        Ejercicio1.Fruta pera = new Ejercicio1.Fruta("Verde", "Pera");
        Ejercicio1.Fruta mandarina = new Ejercicio1.Fruta("Naranja", "Mandarina");
        Ejercicio1.Fruta melon = new Ejercicio1.Fruta("Verde", "Melon");
        List<Ejercicio1.Fruta> fruteria = Arrays.asList(naranja, pera, mandarina, melon);
        fruteria.stream().map(Fruta::getColor).distinct().forEach(System.out::println);

    }

}
