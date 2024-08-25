import java.util.*;

public class Dois {
    public static void main(String args []) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Digite um numero:");
            int a = entrada.nextInt();
            
            if (a >= 0) {
                System.out.println("Positivo");
            } else {
                System.out.println("Negativo");
            }
            
            entrada.close(); // Fechar o Scanner
        }
    }
}
