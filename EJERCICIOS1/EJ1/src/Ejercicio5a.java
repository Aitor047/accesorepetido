import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio5a {

    private static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        try {
            System.out.println("Escribe un numero entero");
            int numero = Integer.parseInt(bf.readLine());
            System.out.println((int)Math.random()*numero+1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
