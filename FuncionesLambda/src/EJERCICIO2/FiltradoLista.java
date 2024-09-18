package EJERCICIO2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FiltradoLista {
    public static void main(String[] args) {
        List<String> ciudades = Arrays.asList("Madrid", "Mallorca", "Barcelona", "Valencia", "Albacete", "Teruel", "Menorca");
        Predicate<String> filtro = s -> s.startsWith("M");
        List<String> ciudadM = ciudades.stream().filter(filtro).toList();
        System.out.println(ciudadM);
    }
}
