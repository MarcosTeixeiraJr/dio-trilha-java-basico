package celular.ligacao;

public class CorreioVoz implements AparelhoTelefonico {

    @Override
    public void ligar() {
        System.out.println("Chamada sendo encaminhada para correio de voz.");
    }
}
