package padroesestruturais.decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HamburguerTest {

    @Test
    void deveRetornarPrecoComTudo() {
        Hamburguer h = new Bacon(new Queijo(new MolhoEspecial(new HamburguerBase(1000.0f))));
        assertEquals(1386.0f, h.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarDescricaoComTudo() {
        Hamburguer h = new Bacon(new Queijo(new MolhoEspecial(new HamburguerBase())));
        assertEquals("Hamburguer/Molho/Queijo/Bacon", h.getDescricao());
    }
}