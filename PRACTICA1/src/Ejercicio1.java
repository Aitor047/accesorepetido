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
            System.out.println(uno + (Impar(uno) ? " es impar" : " no es impar"));
            System.out.println(uno + (mayorQue(uno) ? " es mayor que 5" : "") + (igualQue(uno) ? " es igual que 5" : "") + (menorQue(uno) ? " es menor que 10" : ""));
            System.out.println("");

            //SEGUNDO NUMERO
            System.out.println("Escribe el segundo numero");
            int dos = Integer.parseInt(bf.readLine());
            System.out.println(dos + (Impar(dos) ? " es impar" : " no es impar"));
            System.out.println(dos + (mayorQue(dos) ? " es mayor que 5" : "") + (igualQue(dos) ? " es igual que 5" : "") + (menorQue(dos) ? " es menor que 10" : ""));
            System.out.println((yaIntroducido(uno, dos) ? " ya a sido introducido anteriormente" : ""));

            //TERCER NUMERO
            System.out.println("Escribe el tercer numero");
            int tres = Integer.parseInt(bf.readLine());
            System.out.println(tres + (Impar(tres) ? " es impar" : " no es impar"));
            System.out.println(tres + (mayorQue(tres) ? " es mayor que 5" : "") + (igualQue(tres) ? " es igual que 5" : "") + (menorQue(tres) ? " es menor que 10" : ""));
            System.out.println((yaIntroducido(tres, uno) ? " ya a sido introducido anteriormente" : "") + (yaIntroducido(tres, dos) ? " ya a sido introducido anteriormente" : ""));

            //CUARTO NUMERO
            System.out.println("Escribe el cuarto numero");
            int cuatro = Integer.parseInt(bf.readLine());
            System.out.println(cuatro + (Impar(cuatro) ? " es impar" : " no es impar"));
            System.out.println(cuatro + (mayorQue(cuatro) ? " es mayor que 5" : "") + (igualQue(cuatro) ? " es igual que 5" : "") + (menorQue(cuatro) ? " es menor que 10" : ""));
            System.out.println((yaIntroducido(cuatro, uno) ? " ya a sido introducido anteriormente" : "") + (yaIntroducido(cuatro, dos) ? " ya a sido introducido anteriormente" : "") + (yaIntroducido(cuatro, tres) ? " ya a sido introducido anteriormente" : ""));

            //QUINTO NUMERO
            System.out.println("Escribe el quinto numero");
            int cinco = Integer.parseInt(bf.readLine());
            System.out.println(cinco + (Impar(cinco) ? " es impar" : " no es impar"));
            System.out.println(cinco + (mayorQue(cinco) ? " es mayor que 5" : "") + (igualQue(cinco) ? " es igual que 5" : "") + (menorQue(cinco) ? " es menor que 10" : ""));
            System.out.println((yaIntroducido(cinco, uno) ? " ya a sido introducido anteriormente" : "") + (yaIntroducido(cinco, dos) ? " ya a sido introducido anteriormente" : "") + (yaIntroducido(cinco, tres) ? " ya a sido introducido anteriormente" : "") + (yaIntroducido(cinco, cuatro) ? " ya a sido introducido anteriormente" : ""));

            //MEDIA ARITMETICA
            System.out.println("La media aritmetica de los numeros introducidos es: " + mediaAritmetica(uno, dos, tres, cuatro, cinco));

        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        
    }

    //COMPRUEBA SI EL NUMERO ES IMPAR AVERIGUANDO SI EL RESTO DEL NUMERO DIVIDIDO ENTRE DOS ES DISTINTO A 0
    public static boolean Impar(int numero) {
        return numero % 2 != 0;
    }

    //COMPARA EL NUMERO PASADO CON EL CINCO PARA SABER SI ES MAYOR
    public static boolean mayorQue(int numero) {
        return numero > 5;
    }

    //COMPARA EL NUMERO PASADO CON EL CINCO PARA SABER SI ES IGUAL
    public static boolean igualQue(int numero) {
        return numero == 5;
    }

    //COMPARA EL NUMERO PASADO CON EL DIEZ PARA SABER SI ES MENOR
    public static boolean menorQue(int numero) {
        return numero < 10;
    }

    //COMPARA LOS NUMEROS PROPORCIONADOS PARA SABER SI HAN SIDO INTRODUCIDOS ANTERIORMENTE
    private static boolean yaIntroducido(int numero1, int numero2) {
        return numero1 == numero2;
    }

    private static double mediaAritmetica(int numero1, int numero2, int numero3, int numero4, int numero5) {
        return (numero1 + numero2 + numero3 + numero4 + numero5) / 5;
    }


}
