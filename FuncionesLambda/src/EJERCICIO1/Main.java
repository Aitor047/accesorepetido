package EJERCICIO1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main {

    private static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        try {
            System.out.println("Escribe el primer numero");
            int numero1 = Integer.parseInt(bf.readLine());
            System.out.println("Escribe el segundo numero");
            int numero2 = Integer.parseInt(bf.readLine());

            Calculadora suma = (a, b) -> a + b;
            Calculadora resta = (a, b) -> a - b;
            Calculadora multiplicacion = (a, b) -> a * b;
            Calculadora division = (a, b) -> a / b;

            System.out.println("La suma de los numeros " + numero1 + " y " + numero2 + " es: " + suma.calculate(numero1, numero2));
            System.out.println("La resta de los numeros " + numero1 + " y " + numero2 + " es: " + resta.calculate(numero1, numero2));
            System.out.println("La multiplicacion de los numeros " + numero1 + " y " + numero2 + " es: " + multiplicacion.calculate(numero1, numero2));
            System.out.println("La division de los numeros " + numero1 + " y " + numero2 + " es: " + division.calculate(numero1, numero2));


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
