package Ejercicio3;

import java.util.Arrays;
import java.util.List;

public class Ej3 {
    public static void main(String[] args) {

        // LISTA NUMOEROS ENTEROS
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // LISTA DE NUMEROS IMPARES
        List<Integer> impares = numbers.stream().filter(n -> n % 2 != 0).toList();

        // LISTA DE NUMEROS PARES
        List<Integer> pares = numbers.stream().filter(n -> n % 2 == 0).toList();

        // SOUT
        System.out.println("Partitioned:  {impares=" + impares + ",  pares=" + pares + "}");

    }
}
