import java.util.*;
public class Desafio02 {
    public static void main(String args []) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero");
        int a= entrada.nextInt();
        if(a>=0)
        {
        System.out.println("Positivo");
        }
        if(a<0)
        {
        System.out.println("Negativo");
        }
    }
}