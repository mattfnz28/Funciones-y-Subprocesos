package funcionesprocesos;

/**
 *
 * @author Matias Fernandez
 */
public class ejercicio6 {
     public static void main(String[] args) {
        int numeroGenerado = obtenerNumero();
        System.out.println("El numero aleatorio es: " + numeroGenerado);
    }
    public static int obtenerNumero() {
        
        return (int) (Math.random() * 100) + 1;
    }
}