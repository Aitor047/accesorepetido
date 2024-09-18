import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainFunction {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(2, 4, 15, 12, 3);
        Function<Integer, Integer> cuadrados = n -> n * n;
        List<Integer> numerosCuadrados = numeros.stream().map(cuadrados).toList();
        System.out.println(numerosCuadrados);
    }
}