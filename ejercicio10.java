package funcionesprocesos;

/**
 *
 * @author Matias Fernandez
 */
public class ejercicio10 {
     public static void main(String[] args) {
        int resultadoMayor = mayor(15, 26);
        System.out.println("El numero mayor es: " + resultadoMayor);
    }
    public static int mayor(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}