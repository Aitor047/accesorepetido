import java.util.Random;
import java.util.function.Supplier;

public class MainSupplier {
    public static void main(String[] args) {
        Supplier<Integer> aleatorio = () -> new Random().nextInt(100);
        for (int i = 0; i < 50; i++) {
            System.out.println(aleatorio.get());
        }
    }
}
