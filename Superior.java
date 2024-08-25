//Classe Superior
public class Superior {
    public static void main(String[] args) {
        // Criando os objetos
        Smarthphone Smarth = new Smarthphone();
        
        // Instanciar e atribuir valores ao primeiro objeto
        Smarth.peso = "200g";
        Smarth.cor = "Preto";
        Smarth.bateria = 20;
        Smarth.mostrarDados();
        
        // Criando e instanciando o segundo objeto
        Smarthphone Smarth2 = new Smarthphone();
        Smarth2.peso = "110g";
        Smarth2.cor = "Branco";
        Smarth2.bateria = 25;
        Smarth2.mostrarDados();
    }
}

class Smarthphone {
    
    // Declaração de atributos
    String peso;
    String cor;
    int bateria;
    
    // Método para mostrar configurações
    void mostrarDados() {
        System.out.println("Informações do Smarthphone:");
        System.out.println("Peso: " + peso);
        System.out.println("Cor: " + cor);
        System.out.println("Bateria: " + bateria + "%");
        System.out.println();
    }
}
