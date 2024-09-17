import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio1 {
    private static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {

        try {

            System.out.println("Introduce el alto del rectangulo");
            Float alto = Float.parseFloat(bf.readLine());
            System.out.println("Introduce el ancho del rectangulo");
            Float ancho = Float.parseFloat(bf.readLine());
            Float resultado = generarArea(alto, ancho);
            System.out.println("El area del rectangulo es: " + resultado);
            
        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        }
        
    }

    private static float generarArea(Float alto, Float ancho) {
        float area;
        area = alto * ancho;
        return area;
    
    }
}
