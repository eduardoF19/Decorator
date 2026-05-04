package padroesestruturais.decorator;

public abstract class HamburguerDecorator implements Hamburguer {

    protected Hamburguer hamburguer;

    public HamburguerDecorator(Hamburguer hamburguer) {
        this.hamburguer = hamburguer;
    }

    @Override
    public float getPreco() {
        return hamburguer.getPreco();
    }

    @Override
    public String getDescricao() {
        return hamburguer.getDescricao();
    }
}