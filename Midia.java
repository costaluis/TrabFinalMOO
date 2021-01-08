/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5;

import java.util.Date;

/**
 *
 * @author luis
 */
public class Midia {
    private int id;
    private String titulo;
    private String pais;
    private String genero;
    private Date data_lancamento;
    private Critica[] lista_critica;

    public Midia(String titulo, String pais, String genero, Date data_lancamento, Critica[] lista_critica) {
        this.titulo = titulo;
        this.pais = pais;
        this.genero = genero;
        this.data_lancamento = data_lancamento;
        this.lista_critica = lista_critica;
    }
    
    public void inserir_avalicao(String avaliacao, int nota){
        //TODO
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setData_lancamento(Date data_lancamento) {
        this.data_lancamento = data_lancamento;
    }

    public void setLista_critica(Critica[] lista_critica) {
        this.lista_critica = lista_critica;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getPais() {
        return pais;
    }

    public String getGenero() {
        return genero;
    }

    public Date getData_lancamento() {
        return data_lancamento;
    }

    public Critica[] getLista_critica() {
        return lista_critica;
    }
    
    
  
}
