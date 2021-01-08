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
public class Critico extends ContaUsuario {
    private int id_verificado;

    public Critico(int id_verificado, int id, String email, String senha, String username, String bio, Date data_nascimento, Image foto, int[] lista_amigos, int[] lista_block) {
        super(id, email, senha, username, bio, data_nascimento, foto, lista_amigos, lista_block);
        this.id_verificado = id_verificado;
    }

    public void setId_verificado(int id_verificado) {
        this.id_verificado = id_verificado;
    }

    public int getId_verificado() {
        return id_verificado;
    }
    
}
