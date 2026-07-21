package funcionesprocesos;

/**
 *
 * @author Matias Fernandez
 */
public class ejercicio4 {
    public static void main(String[] args) {
       mostrarDatos("Mati", 17);
    }
    public static void mostrarDatos(String nombre, int edad) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        if (edad >= 18) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("Es menor de edad.");
        }
    }
}