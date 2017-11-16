package br.edu.infnet.pos.java.trabalhodebloco.dominio.entidades.pesquisa;

import br.edu.infnet.pos.java.trabalhodebloco.dominio.entidades.estruturainterna.Aluno;
import br.edu.infnet.pos.java.trabalhodebloco.test.util.TesteEntidade;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RespostaTest extends TesteEntidade {

    private Resposta resposta;

    @Before
    public void setUp() {
        resposta = new Resposta();
    }

    @After
    public void tearDown() {
        resposta = null;
    }

    @Test
    public void deveValidarOID() {
        super.deveValidarOID(resposta);
    }
    
    @Test
    public void aRespostaDeveSerRespondidaPorUmAluno() {
        final String nomeAluno = "Carter McCarthy";
        Aluno aluno = new Aluno();
        aluno.setNome(nomeAluno);
        resposta.setAluno(aluno);
        assertEquals(nomeAluno, resposta.getAluno().getNome());
    }

}
