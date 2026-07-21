package funcionesprocesos;

/**
 *
 * @author Matias Fernandez
 */
public class ejercicio9 {
        
    public static void main(String[] args) {
        double promFinal = calcularPromedio (6.0, 5.5, 10.0);
        System.out.println("Promedio: " + promFinal);
        if (promFinal >= 7.0) {
            System.out.println("El estudiante aprobo.");
        } else {
            System.out.println("El estudiante reprobo.");
        }
    }
    public static double calcularPromedio(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3.0; // 
    }
}