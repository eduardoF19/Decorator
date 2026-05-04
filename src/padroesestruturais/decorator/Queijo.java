package padroesestruturais.decorator;

public class Queijo extends HamburguerDecorator {

    public Queijo(Hamburguer hamburguer) {
        super(hamburguer);
    }

    @Override
    public float getPreco() {
        return hamburguer.getPreco() * 1.2f;
    }

    @Override
    public String getDescricao() {
        return hamburguer.getDescricao() + "/Queijo";
    }
}