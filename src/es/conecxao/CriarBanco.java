/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.conecxao;

import es.gui.PrincipalJFrame;
import es.util.Util;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class CriarBanco {

    public CriarBanco() throws SQLException {
        HibernateUtil.setUser("root");
        HibernateUtil.setPass("utfpr");

        Connection conexao = Conexao.getConnection();
        if (Util.imprimirConfirmacao("Já possui a base de dados ?")) {
            Util.abrirJFrameCentralizado(new PrincipalJFrame());

        } else {
            try {
                conexao.createStatement().execute("create database if not EXISTS es");
                conexao.createStatement().execute("use es");
                HibernateUtil.criarSchema();
                Util.abrirJFrameCentralizado(new PrincipalJFrame());

            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Problema ao criar Banco");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro inesperado ao tentar iniciar");
            }
        }
    }

}
