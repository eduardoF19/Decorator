package padroesestruturais.decorator;

public class MolhoEspecial extends HamburguerDecorator {

    public MolhoEspecial(Hamburguer hamburguer) {
        super(hamburguer);
    }

    @Override
    public float getPreco() {
        return hamburguer.getPreco() * 1.05f;
    }

    @Override
    public String getDescricao() {
        return hamburguer.getDescricao() + "/Molho";
    }
}