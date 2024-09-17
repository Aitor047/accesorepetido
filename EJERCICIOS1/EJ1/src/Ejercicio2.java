import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio2 {

    private static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        
        try {
            System.out.println("Introduce tu nombre" );
            String nombre = String.valueOf(bf.readLine());
            System.out.println("\n" + "Hola " + nombre);

        } catch (IOException e) {
            
            e.printStackTrace();
        }

    }

}
