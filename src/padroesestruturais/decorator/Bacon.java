package padroesestruturais.decorator;

public class Bacon extends HamburguerDecorator {

    public Bacon(Hamburguer hamburguer) {
        super(hamburguer);
    }

    @Override
    public float getPreco() {
        return hamburguer.getPreco() * 1.1f;
    }

    @Override
    public String getDescricao() {
        return hamburguer.getDescricao() + "/Bacon";
    }
}
