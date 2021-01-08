/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5;

/**
 *
 * @author luis
 */
public class Filme extends Midia{
    private int duracao;
    private String diretor;
    private String[] elenco;
    private String sinopse;

    public Filme(int duracao, String diretor, String[] elenco, String sinopse, String titulo, String pais, String genero, Date data_lancamento, Critica[] lista_critica) {
        super(titulo, pais, genero, data_lancamento, lista_critica);
        this.duracao = duracao;
        this.diretor = diretor;
        this.elenco = elenco;
        this.sinopse = sinopse;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String[] getElenco() {
        return elenco;
    }

    public void setElenco(String[] elenco) {
        this.elenco = elenco;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
    
    
}
