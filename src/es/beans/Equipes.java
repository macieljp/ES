/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.beans;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author macieljp
 */
@Entity
public class Equipes implements Serializable {

    @Id
    private int codEqu;
    private String descricao;
    @OneToOne
    private int codGrupo;
    private String cidade;
    private String estado;
    private String responsavel;
    private String email;

    public Equipes() {
    }

    public Equipes(int codEqu, String descricao, int codGrupo, String cidade, String estado, String responsavel, String email) {
        this.codEqu = codEqu;
        this.descricao = descricao;
        this.codGrupo = codGrupo;
        this.cidade = cidade;
        this.estado = estado;
        this.responsavel = responsavel;
        this.email = email;
    }

    /**
     * @return the codEqu
     */
    public int getCodEqu() {
        return codEqu;
    }

    /**
     * @param codEqu the codEqu to set
     */
    public void setCodEqu(int codEqu) {
        this.codEqu = codEqu;
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

    /**
     * @return the codGrupo
     */
    public int getCodGrupo() {
        return codGrupo;
    }

    /**
     * @param codGrupo the codGrupo to set
     */
    public void setCodGrupo(int codGrupo) {
        this.codGrupo = codGrupo;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the responsavel
     */
    public String getResponsavel() {
        return responsavel;
    }

    /**
     * @param responsavel the responsavel to set
     */
    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

}
