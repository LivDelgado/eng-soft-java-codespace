package dcc603.construtora.funcionarios;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestFuncionario {
    @Test
    public void testGetNome() {
        Funcionario funcionario = new Funcionario("Teste", 1980, 1999);
        assertEquals("Teste", funcionario.getNome());
    }
}
