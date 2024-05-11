package celular.menu.internet;

public class NavegadorInternet {
    //exibir página, adicionar nova aba 
    //e atualizar pagina

    public void exibirPagina() {
        adicionarAba();
        atualizarPagina();
        System.out.println("Exibindo página.");
    }
    private void adicionarAba () {
        System.out.println("Adicionando nova aba.");
    }
    private void atualizarPagina() {
        System.out.println("Atualizando a página.");
    }
}
