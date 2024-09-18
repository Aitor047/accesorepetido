import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Ejercicio3 {
    public static void main(String[] args) {
        Function<Integer, Integer> cubo = n -> n * n * n;
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> cubos = numeros.stream().map(cubo).toList();
        System.out.println(cubos);
    }
}
