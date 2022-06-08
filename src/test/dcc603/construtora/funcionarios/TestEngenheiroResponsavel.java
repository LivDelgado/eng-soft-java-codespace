package dcc603.construtora.funcionarios;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestEngenheiroResponsavel {
    @Test
    public void testAdicionarProjeto() {
        EngenheiroResponsavel engenheiro = new EngenheiroResponsavel("Teste", 1980, 1999, 2);
        engenheiro.adicionarProjeto();
        assertEquals(3, engenheiro.getNumeroProjetosLiderados());
    }

    @Test
    public void testGetNome() {
        EngenheiroResponsavel engenheiro = new EngenheiroResponsavel("Teste", 1980, 1999, 2);
        assertEquals("Teste", engenheiro.getNome());
    }
}
