import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Ejercicio6 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);
        Consumer<Integer> dividir = n -> System.out.println(n * 3);
        numeros.forEach(dividir);
    }
}
