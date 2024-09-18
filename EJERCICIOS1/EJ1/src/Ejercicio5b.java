import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio5b {

    private static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        try {
            System.out.println("Escribe un numero entero");
            int numeroA = Integer.parseInt(bf.readLine());
            System.out.println("Escribe otro numero entero");
            int numeroB = Integer.parseInt(bf.readLine());
            int numeroMayor = Math.max(numeroA, numeroB);
            int numeroMenor = Math.min(numeroA, numeroB);
            System.out.println((int)Math.floor(Math.random()*(numeroMayor - numeroMenor + 1) + numeroMenor));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
