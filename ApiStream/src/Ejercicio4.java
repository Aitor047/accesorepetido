import java.util.Random;
import java.util.function.Supplier;

public class Ejercicio4 {
    public static void main(String[] args) {
        Supplier<Integer> random = () -> new Random().nextInt(1000);
        for (int i = 0; i < 10; i++) {
            System.out.println(random.get());
        }
    }
}
