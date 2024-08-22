import java.util.*;
public class Baskara {
public static void main (String args[]) {
double a, b, c, delta, x1, x2;
Scanner entrada;
entrada = new Scanner(System.in);  
    System.out.print("Digite o valor do a: ");
    a = entrada.nextDouble();	
    System.out.print("Digite o valor do b: ");
    b = entrada.nextDouble();	
    System.out.print("Digite o valor do c : ");
    c = entrada.nextDouble();	
    if (a == 0)
                System.out.println("Estes valores nao formam uma equacao de segundo grau ");
                else { 
    delta = (b * b) - ( 4 * a * c);
        if (delta < 0)
    System.out.println("Nao existe raiz real ");
        if (delta == 0) { 
    System.out.println("Existe uma raiz real");
   	x1 = (- b) / (2 * a);
                               //x1Format recebe o valor de x1 e o convert em String
                               //assim, posso perguntar se ele contem a fração que preciso
                               //caso verdadeiro, atribuo o valor de x1 a uma String definida, que seria nesse ex: 1/2
                            String x1Format = String.valueOf(x1);
                            if (x1Format.contains("0.5")){ 
                               //aqui voce faz os outros if, para representar um terço, um quarto, um quinto, etc
                               //dependendo da necessidade, caso for representações maiores, teria que mudar um pouco a logica
                                x1Format = "1/2";
                                System.out.println("Raiz = "+x1Format);
                                }
   	//System.out.println("Raiz = "+x1);
    }
                       //------------ fim exemplo
        if (delta > 0) { 
        System.out.println("Existem duas raizes reais");
   	x1 = (- b + Math.sqrt(delta))/(2 * a);
   	x2 = (- b - Math.sqrt(delta))/( 2 * a);
    System.out.println("Primeira raiz = " + x1);
    System.out.println("Segunda raiz = " + x2);
    }
    }
}
}