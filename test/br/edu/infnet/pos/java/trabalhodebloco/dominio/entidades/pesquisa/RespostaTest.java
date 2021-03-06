package br.edu.infnet.pos.java.trabalhodebloco.dominio.entidades.pesquisa;

import br.edu.infnet.pos.java.trabalhodebloco.dominio.entidades.estruturainterna.Aluno;
import br.edu.infnet.pos.java.trabalhodebloco.dominio.entidades.estruturainterna.Modulo;
import br.edu.infnet.pos.java.trabalhodebloco.dominio.entidades.estruturainterna.Turma;
import br.edu.infnet.pos.java.trabalhodebloco.test.util.TesteEntidade;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RespostaTest extends TesteEntidade {

    private Resposta resposta;

    @Before
    public void setUp() {
        resposta = new Resposta() {

            private static final long serialVersionUID = 3109256773218160485L;

            @Override
            public Object getValor() {
                return null;
            }

            @Override
            public void setValor(Object valor) {
                // Não faça nada.
            }

        };
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

    @Test
    public void aRespostaDeveTerUmaAvaliacaoAssociada() {
        final Integer ID_AVALIACAO = 35345;
        Avaliacao avaliacao = new Avaliacao();
        avaliacao.setId(ID_AVALIACAO);
        resposta.setAvaliacao(avaliacao);
        assertEquals(ID_AVALIACAO, resposta.getAvaliacao().getId());
    }

    @Test
    public void aRespostaDeveSerDeUmaDeterminadaQuestao() {
        final Integer ID_QUESTAO = 737383;
        Questao questao = new Questao();
        questao.setId(ID_QUESTAO);
        resposta.setQuestao(questao);
        assertEquals(ID_QUESTAO, resposta.getQuestao().getId());
    }

    @Test
    public void aRespostaDeveEstarAssociadaComUmaTurma() {
        final Integer ID_TURMA = 737324383;
        Turma turma = new Turma();
        turma.setId(ID_TURMA);
        resposta.setTurma(turma);
        assertEquals(ID_TURMA, resposta.getTurma().getId());
    }
    
    @Test
    public void aRespostaDeveEstarAssociadaComUmModulo() {
        final Integer ID_MODULO = 1234383;
        Modulo modulo = new Modulo();
        modulo.setId(ID_MODULO);
        resposta.setModulo(modulo);
        assertEquals(ID_MODULO, resposta.getModulo().getId());
    }
}
