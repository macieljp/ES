/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.dao;

import es.beans.Equipes;

/**
 *
 * @author Aluno
 */
public class DaoEquipes extends DaoGenerics<Equipes> {

    public DaoEquipes() {
         super.alvo = Equipes.class;
    }
    
    
}
