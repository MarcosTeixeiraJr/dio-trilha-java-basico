package celular.aparelho;

import celular.menu.internet.NavegadorInternet;
import celular.menu.ligacao.AparelhoTelefonico;
import celular.menu.musica.ReprodutorMusica;

public class AparelhoCelular {
    public static void main(String[] args) {
        NavegadorInternet internet = new NavegadorInternet();
        internet.exibirPagina();

        AparelhoTelefonico ligacao = new AparelhoTelefonico();
        ligacao.correioVoz();

        ReprodutorMusica musica = new ReprodutorMusica();
        musica.tocar();
    }
}
