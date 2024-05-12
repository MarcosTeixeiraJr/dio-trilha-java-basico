package celular.Iphone;

import celular.internet.NavegadorInternet;
import celular.ligacao.AparelhoTelefonico;
import celular.musica.ReprodutorMusica;

public class IphoneFuncoes implements NavegadorInternet, AparelhoTelefonico, ReprodutorMusica {
    
    @Override
    public void navegar() {
        System.out.println("Adicionando nova aba.");
        System.out.println("Atualizando a página.");
        System.out.println("Exibindo página.");

    }
    @Override
    public void ligar() {
        System.out.println("Ligando...");
        System.out.println("Ligação atendida.");
        System.out.println("Chamada sendo encaminhada para correio de voz.");
    }
    @Override
    public void musica() {
        System.out.println("Selecionando música."); 
        System.out.println("Música pausada.");
        System.out.println("Tocando a música.");
    }
}
