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
public class Nota {
    private int nota_rotten;
    private int nota_IMDb;
    private int nota_metacritics;
    private int nota_geral;

    public Nota(int nota_rotten, int nota_IMDb, int nota_metacritics, int nota_geral) {
        this.nota_rotten = nota_rotten;
        this.nota_IMDb = nota_IMDb;
        this.nota_metacritics = nota_metacritics;
        this.nota_geral = nota_geral;
    }

    public int getNota_rotten() {
        return nota_rotten;
    }

    public void setNota_rotten(int nota_rotten) {
        this.nota_rotten = nota_rotten;
    }

    public int getNota_IMDb() {
        return nota_IMDb;
    }

    public void setNota_IMDb(int nota_IMDb) {
        this.nota_IMDb = nota_IMDb;
    }

    public int getNota_metacritics() {
        return nota_metacritics;
    }

    public void setNota_metacritics(int nota_metacritics) {
        this.nota_metacritics = nota_metacritics;
    }

    public int getNota_geral() {
        return nota_geral;
    }

    public void setNota_geral(int nota_geral) {
        this.nota_geral = nota_geral;
    }
    
}
