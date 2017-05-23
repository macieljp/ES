/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.beans;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author macieljp
 */
@Entity
public class Jogadores implements Serializable {

    @Id
    private int codJog;
    private String nome;
    private String rua;
    private String bairro;
    private String cep;
    private String cidade;
    private String estado;
    private String cpf;
    private String rg;
    private String tituloEleitor;
    private String estadoCivil;
    private String sexo;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar nascimento;
    private float peso;
    private float altura;
    private int tamCalcado;
    private String tamCamisa;
    private int codNac;
    private int codEquipe;

    public Jogadores() {
    }

    /**
     * @return the codJog
     */
    public int getCodJog() {
        return codJog;
    }

    /**
     * @param codJog the codJog to set
     */
    public void setCodJog(int codJog) {
        this.codJog = codJog;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the rua
     */
    public String getRua() {
        return rua;
    }

    /**
     * @param rua the rua to set
     */
    public void setRua(String rua) {
        this.rua = rua;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
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
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * @return the tituloEleitor
     */
    public String getTituloEleitor() {
        return tituloEleitor;
    }

    /**
     * @param tituloEleitor the tituloEleitor to set
     */
    public void setTituloEleitor(String tituloEleitor) {
        this.tituloEleitor = tituloEleitor;
    }

    /**
     * @return the estadoCivil
     */
    public String getEstadoCivil() {
        return estadoCivil;
    }

    /**
     * @param estadoCivil the estadoCivil to set
     */
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the nascimento
     */
    public Calendar getNascimento() {
        return nascimento;
    }

    /**
     * @param nascimento the nascimento to set
     */
    public void setNascimento(Calendar nascimento) {
        this.nascimento = nascimento;
    }

    /**
     * @return the peso
     */
    public float getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }

    /**
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * @return the tamCalcado
     */
    public int getTamCalcado() {
        return tamCalcado;
    }

    /**
     * @param tamCalcado the tamCalcado to set
     */
    public void setTamCalcado(int tamCalcado) {
        this.tamCalcado = tamCalcado;
    }

    /**
     * @return the tamCamisa
     */
    public String getTamCamisa() {
        return tamCamisa;
    }

    /**
     * @param tamCamisa the tamCamisa to set
     */
    public void setTamCamisa(String tamCamisa) {
        this.tamCamisa = tamCamisa;
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
     * @return the codEquipe
     */
    public int getCodEquipe() {
        return codEquipe;
    }

    /**
     * @param codEquipe the codEquipe to set
     */
    public void setCodEquipe(int codEquipe) {
        this.codEquipe = codEquipe;
    }

}
