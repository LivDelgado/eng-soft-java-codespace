package dcc603.construtora.projeto;

import static org.junit.Assert.*;
import org.junit.Test;

import dcc603.construtora.funcionarios.EngenheiroResponsavel;

public class TestProjeto {
    @Test
    public void testFecharProjeto() {
        Projeto projeto = new Projeto();
        projeto.fecharProjeto();

        assertTrue(projeto.projetoFechado());
        assertEquals(2, projeto.getStatus());
    }

    @Test
    public void testAtribuirFuncionarioResponsavel() {
        EngenheiroResponsavel engenheiroResponsavel = new EngenheiroResponsavel("Teste", 1970, 1988, 50);
        Projeto projeto = new Projeto();
        projeto.atribuirFuncionarioResponsavel(engenheiroResponsavel);

        assertEquals(engenheiroResponsavel, projeto.getFuncionarioResponsavel());
    }
}
