package Padroes.Strategy;

public class ComportamentoNormal implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Ação normal");
    }
    
}
