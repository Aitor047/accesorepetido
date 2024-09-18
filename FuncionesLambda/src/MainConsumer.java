import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MainConsumer {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Mario", "antonio", "pedro", "paco" );
        Consumer<String> mostrarNombres = s -> System.out.println(s);
        nombres.forEach(mostrarNombres);
    }
}
