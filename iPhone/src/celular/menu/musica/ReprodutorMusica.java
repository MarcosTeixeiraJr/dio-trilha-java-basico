package celular.menu.musica;

public class ReprodutorMusica {
     //tocar, pausar e selecionarmúsica
     
     public void tocar() {
        selecionarMusica();
        pausar();
        System.out.println("Tocando a música.");
    }
    private void pausar() {
        System.out.println("Música pausada.");
    }
    private void selecionarMusica() {
        System.out.println("Selecionando música.");
    }
}
