/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5;

import java.awt.Image;
import java.util.Date;
import java.util.Vector;

/**
 *
 * @author luis
 */
public class ContaUsuario {
    private int id;
    private String email;
    private String senha;
    private String username;
    private String bio;
    private Date data_nascimento;
    private Image foto;
    private int lista_amigos[];
    private int lista_block[];
    
    public Midia busca_midia(String nome_midia, ListaMidias lista){
        //TODO
    }
    
    public Usuario busca_usuario(String username, ListaUsuarios lista){
        //TODO
    }
    
    void inserir_avaliacao(String avaliacao, int nota, Midia midia){
        //TODO
    }
    
    void recomendar_midia(String nome_midia, String username){
        //TODO
    }

    public ContaUsuario(int id, String email, String senha, String username, String bio, Date data_nascimento, Image foto, int[] lista_amigos, int[] lista_block) {
        this.id = id;
        this.email = email;
        this.senha = senha;
        this.username = username;
        this.bio = bio;
        this.data_nascimento = data_nascimento;
        this.foto = foto;
        this.lista_amigos = lista_amigos;
        this.lista_block = lista_block;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String getUsername() {
        return username;
    }

    public String getBio() {
        return bio;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public Image getFoto() {
        return foto;
    }

    public int[] getLista_amigos() {
        return lista_amigos;
    }

    public int[] getLista_block() {
        return lista_block;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public void setFoto(Image foto) {
        this.foto = foto;
    }

    public void setLista_amigos(int[] lista_amigos) {
        this.lista_amigos = lista_amigos;
    }

    public void setLista_block(int[] lista_block) {
        this.lista_block = lista_block;
    }

}
