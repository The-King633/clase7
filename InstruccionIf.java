import java.util.Scanner;

public class InstruccionIf {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese una edad: ");
        int edad = entrada.nextInt();

        // Estructura condicional completa (if-else)
        if (edad >= 18) {
            System.out.println("Mayor de edad");
        } else {
            System.out.println("Menor de edad");
        }
        
        System.out.println("Adiós!");
        
        entrada.close(); // Cerramos el Scanner por buena práctica
    } // Fin del método main
} // Fin de la clase InstruccionIf
