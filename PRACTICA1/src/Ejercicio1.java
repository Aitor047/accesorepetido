import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio1 {
    private static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        try {
            System.out.println("Escribe el primer numero");
            int uno = Integer.parseInt(bf.readLine());
            if (Impar(uno)) {
                System.out.println(uno + " es impar");
            } else {
                System.out.println(uno + " no es impar");
            }
            System.out.println("Escribe el segundo numero");
            int dos = Integer.parseInt(bf.readLine());
            if (Impar(dos)) {
                System.out.println(dos + " es impar");
            } else {
                System.out.println(dos + " no es impar");
            }
            System.out.println("Escribe el tercer numero");
            int tres = Integer.parseInt(bf.readLine());
            if (Impar(tres)) {
                System.out.println(tres + " es impar");
            } else {
                System.out.println(tres + " no es impar");
            }
            System.out.println("Escribe el cuarto numero");
            int cuatro = Integer.parseInt(bf.readLine());
            if (Impar(cuatro)) {
                System.out.println(cuatro + " es impar");
            } else {
                System.out.println(cuatro + " no es impar");
            }
            System.out.println("Escribe el quinto numero");
            int cinco = Integer.parseInt(bf.readLine());
            if (Impar(cinco)) {
                System.out.println(cinco + " es impar");
            } else {
                System.out.println(cinco + " no es impar");
            }

        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        
    }

    public static boolean Impar(int numero) {
        return numero % 2 != 0;
    }

    


}
