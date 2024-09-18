import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ejercicio2 {
    private static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        try {
            System.out.println("Escribe el primer numero entero");
            int primero = Integer.parseInt(bf.readLine());
            System.out.println("Escribe el segundo numero entero");
            int segundo = Integer.parseInt(bf.readLine());
            System.out.println("Escribe el ultimo numero");
            int tercero = Integer.parseInt(bf.readLine());

            List<Integer> list = Arrays.asList(primero, segundo, tercero);
            Collections.sort(list, Collections.reverseOrder());

            System.out.println("El orden de mayor a menor de los numero introducidos es: " + list);

        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        }
    }

}
