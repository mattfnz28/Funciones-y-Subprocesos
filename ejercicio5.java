package funcionesprocesos;

/**
 *
 * @author Matias Fernandez
 */
public class ejercicio5 {
     public static void main(String[] args) {
        operaciones(18, 5);
    }
    public static void operaciones(int a, int b) {
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicacion: " + (a * b));
        if (b != 0) {
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("Division: No es posible dividir para cero.");
        }
    }
}