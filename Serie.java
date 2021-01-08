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
public class Serie extends Midia{
    private int temporadas;
    private int[] episodios;
    private String[] elenco;

    public Serie(int temporadas, int[] episodios, String[] elenco, String titulo, String pais, String genero, Date data_lancamento, Critica[] lista_critica) {
        super(titulo, pais, genero, data_lancamento, lista_critica);
        this.temporadas = temporadas;
        this.episodios = episodios;
        this.elenco = elenco;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }

    public String[] getElenco() {
        return elenco;
    }

    public void setElenco(String[] elenco) {
        this.elenco = elenco;
    }
     
}
