//jean
import java.util.*;
public class Defafio04 {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        double a = entrada.nextDouble();
        System.out.println("Digite o segundo numero");
        double b = entrada.nextDouble();
        System.out.println("Digite o terceiro numero");
        double c = entrada.nextDouble();
        System.out.println("Digite o quarto numero");
        double d = entrada.nextDouble();
        System.out.println("Digite o quinto numero");
        double e = entrada.nextDouble();
        //Lucas, Kauê 
        if (a > b && a>c && a>d && a>e){
            System.out.println("Primero numero maior");
        }
        if (b > a && b>c && b>d && b>e){
            System.out.println("Segundo numero maior");
        }
        if (c > b && c>a && c>d && c>e){
            System.out.println("Terceiro numero maior");
        }
        if (d > b && d>c && d>a && d>e){
            System.out.println("Quarto numero maior");
        }
        if (e > b && e>c && e>d && e>a){
            System.out.println("Quinto numero maior");
        }
    }
}