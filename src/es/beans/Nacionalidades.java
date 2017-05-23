/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.beans;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author macieljp
 */
@Entity
public class Nacionalidades implements Serializable {

    @Id
    private int codNac;
    private String descricao;

    public Nacionalidades() {
    }

    public Nacionalidades(int codNac, String descricao) {
        this.codNac = codNac;
        this.descricao = descricao;
    }

    /**
     * @return the codNac
     */
    public int getCodNac() {
        return codNac;
    }

    /**
     * @param codNac the codNac to set
     */
    public void setCodNac(int codNac) {
        this.codNac = codNac;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
