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
public class Anime extends Midia{
    private int temporadas;
    private int[] episodios;
    private String estudio;
    private String diretor;
    private String produtor;

    public Anime(int temporadas, int[] episodios, String estudio, String diretor, String produtor, String titulo, String pais, String genero, Date data_lancamento, Critica[] lista_critica) {
        super(titulo, pais, genero, data_lancamento, lista_critica);
        this.temporadas = temporadas;
        this.episodios = episodios;
        this.estudio = estudio;
        this.diretor = diretor;
        this.produtor = produtor;
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

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getProdutor() {
        return produtor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }
    
    
}
