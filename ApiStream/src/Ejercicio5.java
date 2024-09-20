import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>(Arrays.asList("Pedro", "Paco", "Jose Luis", "Sara", "Laura", "Marta", "Pepe"));
        Predicate<String> nombre = s -> s.startsWith("P");
        nombres.removeIf(nombre.negate());
        System.out.println(nombres);
    }
}
