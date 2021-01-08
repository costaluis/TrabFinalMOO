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
public class ListaUsuarios {
    private Usuario[] Usuarios;

    public ListaUsuarios(Usuario[] Usuarios) {
        this.Usuarios = Usuarios;
    }

    public Usuario[] getUsuarios() {
        return Usuarios;
    }

    public void setUsuarios(Usuario[] Usuarios) {
        this.Usuarios = Usuarios;
    }
    
}
