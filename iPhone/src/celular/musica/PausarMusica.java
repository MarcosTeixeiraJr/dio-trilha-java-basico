package celular.musica;

public class PausarMusica implements ReprodutorMusica {

    @Override
    public void musica() {
        System.out.println("Música pausada.");
    }
}
