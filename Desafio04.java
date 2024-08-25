import java.util.*;

public class Desafio04{
    public static void main(String args[]) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Digite o primeiro numero:");
            double a = entrada.nextDouble();
            System.out.println("Digite o segundo numero:");
            double b = entrada.nextDouble();
            System.out.println("Digite o terceiro numero:");
            double c = entrada.nextDouble();
            System.out.println("Digite o quarto numero:");
            double d = entrada.nextDouble();
            System.out.println("Digite o quinto numero:");
            double e = entrada.nextDouble();

            if (a >= b && a >= c && a >= d && a >= e) {
                System.out.println("O primeiro numero é o maior ou um dos maiores.");
            } else if (b >= a && b >= c && b >= d && b >= e) {
                System.out.println("O segundo numero é o maior ou um dos maiores.");
            } else if (c >= a && c >= b && c >= d && c >= e) {
                System.out.println("O terceiro numero é o maior ou um dos maiores.");
            } else if (d >= a && d >= b && d >= c && d >= e) {
                System.out.println("O quarto numero é o maior ou um dos maiores.");
            } else if (e >= a && e >= b && e >= c && e >= d) {
                System.out.println("O quinto numero é o maior ou um dos maiores.");
            }
        }
    }
}
