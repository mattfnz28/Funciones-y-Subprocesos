package funcionesprocesos;

/**
 *
 * @author Matias Fernandez
 */
public class ejercicio11 {
     public static void main(String[] args) {
        int numeroEvaluar = 4;
        if (esPar(numeroEvaluar)) {
            System.out.println("El numero " + numeroEvaluar + " es PAR.");
        } else {
            System.out.println("El numero " + numeroEvaluar + " es IMPAR.");
        }
    }
    public static boolean esPar(int numero) {
        return numero % 2 == 0; 
    }
}
