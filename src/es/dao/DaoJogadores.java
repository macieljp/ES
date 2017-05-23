/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.dao;

import es.beans.Jogadores;

/**
 *
 * @author Aluno
 */
public class DaoJogadores extends DaoGenerics<Jogadores> {

    public DaoJogadores() {

        super.alvo = Jogadores.class;
    }

}
