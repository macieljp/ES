/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.main;

import es.conecxao.CriarBanco;
import java.sql.SQLException;

/**
 *
 * @author Aluno
 */
public class Main {

    public static void main(String[] args) throws SQLException {

        CriarBanco bd = new CriarBanco();
        bd.getClass();
    }

}
