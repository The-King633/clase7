public class OperadoresLogicos { 
    public static void main(String[] args) { 
        System.out.println("Operador AND (&&):"); 
        System.out.println(true && true);   // true
        System.out.println(true && false);  // false
        System.out.println(false && true);  // false
        System.out.println(false && false); // false
        System.out.println(); 

        System.out.println("Operador OR (||):"); 
        System.out.println(true || true);   // true
        System.out.println(true || false);  // true
        System.out.println(false || true);  // true
        System.out.println(false || false); // false
        System.out.println(); 

        System.out.println("Operador NOT (!):"); 
        System.out.println(!true);          // false
        System.out.println(!false);         // true
    } // Fin del método main 
} // Fin de la clase OperadoresLogicos
