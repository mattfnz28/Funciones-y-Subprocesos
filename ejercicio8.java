package funcionesprocesos;

/**
 *
 * @author Matias Fernandez
 */
public class ejercicio8 {
    public static void main(String[] args) {
        double resultado = calcularArea(9.5, 4.3);
        System.out.println("El Area del rectangulo es: " + resultado);
    }
    public static double calcularArea(double base, double altura) {
        return base * altura; 
    }
}
