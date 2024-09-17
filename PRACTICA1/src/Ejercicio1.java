import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio1 {
    private static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        try {
            //PRIMER NUMERO
            System.out.println("Escribe el primer numero");
            int uno = Integer.parseInt(bf.readLine());
            if (Impar(uno)) {
                System.out.println(uno + " es impar");
            } else {
                System.out.println(uno + " no es impar");
            }
            if (mayorQue(uno)) {
                System.out.println(uno + " es mayor que 5");
            } else if (igualQue(uno)) {
                System.out.println(uno + " es igual que 5");
            } else if (menorQue(uno)) {
                System.out.println(uno + " es menor que 10");
            }

            //SEGUNDO NUMERO
            System.out.println("Escribe el segundo numero");
            int dos = Integer.parseInt(bf.readLine());
            if (Impar(dos)) {
                System.out.println(dos + " es impar");
            } else {
                System.out.println(dos + " no es impar");
            }
            if (mayorQue(dos)) {
                System.out.println(dos + " es mayor que 5");
            } else if (igualQue(dos)) {
                System.out.println(dos + " es igual que 5");
            } else if (menorQue(dos)) {
                System.out.println(dos + " es menor que 10");
            }

            //TERCER NUMERO
            System.out.println("Escribe el tercer numero");
            int tres = Integer.parseInt(bf.readLine());
            if (Impar(tres)) {
                System.out.println(tres + " es impar");
            } else {
                System.out.println(tres + " no es impar");
            }
            if (mayorQue(tres)) {
                System.out.println(tres + " es mayor que 5");
            } else if (igualQue(tres)) {
                System.out.println(tres + " es igual que 5");
            } else if (menorQue(tres)) {
                System.out.println(tres + " es menor que 10");
            }

            //CUARTO NUMERO
            System.out.println("Escribe el cuarto numero");
            int cuatro = Integer.parseInt(bf.readLine());
            if (Impar(cuatro)) {
                System.out.println(cuatro + " es impar");
            } else {
                System.out.println(cuatro + " no es impar");
            }
            if (mayorQue(cuatro)) {
                System.out.println(cuatro + " es mayor que 5");
            } else if (igualQue(cuatro)) {
                System.out.println(cuatro + " es igual que 5");
            } else if (menorQue(cuatro)) {
                System.out.println(cuatro + " es menor que 10");
            }

            //QUINTO NUMERO
            System.out.println("Escribe el quinto numero");
            int cinco = Integer.parseInt(bf.readLine());
            if (Impar(cinco)) {
                System.out.println(cinco + " es impar");
            } else {
                System.out.println(cinco + " no es impar");
            }
            if (mayorQue(cinco)) {
                System.out.println(cinco + " es mayor que 5");
            } else if (igualQue(cinco)) {
                System.out.println(cinco + " es igual que 5");
            } else if (menorQue(cinco)) {
                System.out.println(cinco + " es menor que 10");
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

    public static boolean mayorQue(int numero) {
        if (numero > 5) {
            return true;
        } 
        return false;
    }

    public static boolean igualQue(int numero) {
        if (numero == 5) {
            return true;
        } 
        return false;
    }

    private static boolean menorQue(int numero) {
        if (numero < 5) {
            return true;
        } 
        return false;
    }

    private static boolean yaIntroducido(int numero1, int numero2) {
        if (numero1 == numero2) {
            
        }
        return false;
    }


}
