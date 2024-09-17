import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;

public class Ejercicio4 {
    private static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        try {

            
            System.out.println("Introduce un número");
            int num = Integer.parseInt(bf.readLine());
            System.out.println("La raiz cuadrada de " + num + " es " + Math.sqrt(num)) ;

        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        }
    }
}
