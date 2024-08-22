//Classe Superior
public class Superior {
    public static void main (String[] args) {
        //Criando os objetos
        Smarthphone Smarth = new Smarthphone();
        //Instacionar objetos
        Smarth.peso = "200g";
        Smarth.cor = "Preto";
        Smarth. bateria = 20;
        Smarth.mostrarDados();
        
        Smarthphone Smarth2 = new Smarthphone();
        Smarth.peso = "110g";
        Smarth.cor = "Branco";
        Smarth.bateria = 25;
        Smarth.mostrarDados();
    }
}
class Smarthphone {
    
    //Declaração de atrbutos
    //peso do Smarthphone
    String peso;
    
    //cor do Smarthphone
    String cor;
    
    //percentual de bateria do Smarthphone
    int bateria;
    
    //metodos de açao
    void ligar(){
        
    }
    //Mostrar configurações
    void mostrarDados(){
        System.out.println("Informacoes do Smarthphone");
        System.out.println("Peso: "+peso);
        System.out.println("Cor: "+cor);
        System.out.println("Bateria: "+bateria);
        System.out.println("\n");
    }
}