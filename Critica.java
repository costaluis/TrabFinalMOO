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
public class Critica {
    private Date data;
    private int nota;
    private String avaliacao;

    public Critica(Date data, int nota, String avaliacao) {
        this.data = data;
        this.nota = nota;
        this.avaliacao = avaliacao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }
    
}
