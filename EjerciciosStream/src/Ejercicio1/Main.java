package Ejercicio1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Fruta naranja = new Fruta("Naranja", "Naranja");
        Fruta pera = new Fruta("Verde", "Pera");
        Fruta mandarina = new Fruta("Naranja", "Mandarina");
        Fruta melon = new Fruta("Verde", "Melon");
        List<Fruta> fruteria = Arrays.asList(naranja, pera, mandarina, melon);
        fruteria.stream().map(Fruta::getNombre).forEach(System.out::println);

    }

}
