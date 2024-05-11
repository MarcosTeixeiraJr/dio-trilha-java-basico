package celular.menu.ligacao;

public class AparelhoTelefonico {
    //ligar, atender, iniciar correio de voz
    
    public void correioVoz() {
        ligacao();
        ligacaoAtendida();
        System.out.println("Chamada sendo encaminhada para correio de voz.");
    }
    private void ligacao() {
        System.out.println("Ligando...");
    }
    private void ligacaoAtendida() {
        System.out.println("Ligação atendida.");
    }
    
}
