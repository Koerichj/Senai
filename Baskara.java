import java.util.*;
public class Baskara {
    public static void main (String args[]) {
        double a, b, c, delta, x1, x2;
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Digite o valor do A: ");
            a = entrada.nextDouble();	
            System.out.print("Digite o valor do B: ");
            b = entrada.nextDouble();	
            System.out.print("Digite o valor do c: ");
            c = entrada.nextDouble();
        }
        
        if (a == 0) {
            System.out.println("Estes valores nao formam uma equacao de segundo grau.");
        } else { 
            delta = (b * b) - (4 * a * c);
            
            if (delta < 0) {
                System.out.println("Nao existe raiz real.");
            } else if (delta == 0) { 
                System.out.println("Existe uma raiz real");
                x1 = (-b) / (2 * a);

                String x1Format = String.valueOf(x1);
                if (x1Format.contains("0.5")) { 
                    x1Format = "1/2";
                    System.out.println("Raiz = " + x1Format);
                } else {
                    System.out.println("Raiz = " + x1);
                }
            } else if (delta > 0) { 
                System.out.println("Existem duas raizes reais");
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Primeira raiz = " + x1);
                System.out.println("Segunda raiz = " + x2);
            }
        }
    }
}