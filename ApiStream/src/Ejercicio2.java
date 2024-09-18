import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<String> cadenas = Arrays.asList("Madrid", "Barcelona", "Cheste", "Valencia");
        Consumer<String> mostrar = s -> System.out.println(s);
        cadenas.forEach(mostrar);
    }
}
