/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.infnet.pos.java.trabalhodebloco.dominio.entidades.pesquisa.beans;

import br.edu.infnet.pos.java.trabalhodebloco.dominio.entidades.pesquisa.RespostaTextual;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Bruce Notario
 */
@Stateless
public class RespostaTextualFacade extends AbstractFacade<RespostaTextual> {

    @PersistenceContext(unitName = "ProjetoBloco4PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RespostaTextualFacade() {
        super(RespostaTextual.class);
    }
    
}
