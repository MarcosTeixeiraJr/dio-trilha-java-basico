package one.digitalinnovation.gof.strategy;

public class ComportamentoAgressivo extends Comportamento {

    @Override
    public void mover() {
        System.out.println("Movendo-se agressivamente...");
    }
}
