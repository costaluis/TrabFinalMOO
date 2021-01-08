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
public class Jogo extends Midia{
    private String[] plataformas;
    private String desenvolvedor;

    public Jogo(String[] plataformas, String desenvolvedor, String titulo, String pais, String genero, Date data_lancamento, Critica[] lista_critica) {
        super(titulo, pais, genero, data_lancamento, lista_critica);
        this.plataformas = plataformas;
        this.desenvolvedor = desenvolvedor;
    }

    public String[] getPlataformas() {
        return plataformas;
    }

    public void setPlataformas(String[] plataformas) {
        this.plataformas = plataformas;
    }

    public String getDesenvolvedor() {
        return desenvolvedor;
    }

    public void setDesenvolvedor(String desenvolvedor) {
        this.desenvolvedor = desenvolvedor;
    }
    
    
}
