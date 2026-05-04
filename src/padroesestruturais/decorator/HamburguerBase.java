package padroesestruturais.decorator;

public class HamburguerBase implements Hamburguer {

    private float preco;

    public HamburguerBase() {
    }

    public HamburguerBase(float preco) {
        this.preco = preco;
    }

    @Override
    public float getPreco() {
        return preco;
    }

    @Override
    public String getDescricao() {
        return "Hamburguer";
    }
}