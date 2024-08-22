import java.util.*;
public class ConceitoFinal {
    public static void main(String args []) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe a largura: ");
        double larg = entrada.nextDouble();
        
        System.out.print("Informe o comprimento: ");
        double comp = entrada.nextDouble();
        
        System.out.print("Informe a area necessitada: ");
        double area = entrada.nextDouble();

        double area1 = larg * comp;
        double area2 = larg + comp;
        double area3 = area1 - area;
        
        int a = 1;
        double b = area2;
        double c = area3;
        
        double delta = (b*b) - (4*a*c);
        
        if (delta > 0){
            double x1 = ((-b + Math.sqrt(delta)) / (2 * a));
            double x2 = ((-b - Math.sqrt(delta)) / (2 * a));
        System.out.println("x1 = " +x1);
        System.out.println("x2 = " +x2);
        }
        else{
            System.out.print("Nao exixte raiz");
        }
    }
}