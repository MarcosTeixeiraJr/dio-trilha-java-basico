package celular.ligacao;

public class LigacaoAtendida implements AparelhoTelefonico {

    @Override
    public void ligar() {
        System.out.println("Ligação atendida.");
    }
}
