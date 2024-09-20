
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author guipe
 */
public class Prueba extends Thread {

    private int x;

    Prueba(int x) {
        this.x = x;
    }

    @Override
    public void run() {
        for (int i = 0; i < x; i++) {
            try {
                PrimerHilo.sleep(1000);
                System.out.println("contando en el hilo..." + i);
            } catch (InterruptedException ex) {
                Logger.getLogger(PrimerHilo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void main(String[] args) {
        PrimerHilo p = new PrimerHilo(10);
        p.start();
    }

}