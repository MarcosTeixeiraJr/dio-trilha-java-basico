package celular.aparelho;

import celular.Iphone.IphoneFuncoes;

public class AparelhoCelular {
    public static void main(String[] args) {
       // Criando um objeto da classe IphoneFuncoes
       IphoneFuncoes iphone = new IphoneFuncoes();

       // Chamando os métodos da classe IphoneFuncoes
       iphone.navegar(); // Chamando o método navegar()
       iphone.ligar();   // Chamando o método ligar()
       iphone.musica();  // Chamando o método musica()
    }
}

