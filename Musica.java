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
public class Musica extends Midia{
    private int duracao;
    private String compositor;
    private String banda;
    private String album;
    private String letra;

    public Musica(int duracao, String compositor, String banda, String album, String letra, String titulo, String pais, String genero, Date data_lancamento, Critica[] lista_critica) {
        super(titulo, pais, genero, data_lancamento, lista_critica);
        this.duracao = duracao;
        this.compositor = compositor;
        this.banda = banda;
        this.album = album;
        this.letra = letra;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
    
}
