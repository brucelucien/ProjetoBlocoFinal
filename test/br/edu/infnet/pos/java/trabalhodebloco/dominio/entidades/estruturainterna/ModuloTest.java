package br.edu.infnet.pos.java.trabalhodebloco.dominio.entidades.estruturainterna;

import br.edu.infnet.pos.java.trabalhodebloco.dominio.entidades.pesquisa.Resposta;
import br.edu.infnet.pos.java.trabalhodebloco.dominio.entidades.pesquisa.RespostaLikert;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ModuloTest {

    private Modulo modulo;

    @Before
    public void setUp() {
        modulo = new Modulo();
    }

    @Test
    public void toStringDeveRetornarONomeDoModulo() {
        final String nome = "Nome do Módulo";
        modulo.setNome(nome);
        assertEquals(nome, modulo.toString());
    }

    @Test
    public void umModuloPodeTerUmaListaDeRespostas() {
        final Integer ID_RESPOSTA = 23234242;
        List<Resposta> respostas = new ArrayList<>();
        Resposta resposta = new RespostaLikert();
        resposta.setId(ID_RESPOSTA);
        respostas.add(resposta);
        modulo.setRespostas(respostas);
        assertEquals(ID_RESPOSTA, modulo.getRespostas().get(0).getId());
    }
}
