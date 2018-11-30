/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.konecta.chatbot.ejb.dto;

/**
 *
 * @author Luis Galeano
 */
public class UserVars {
    
    private String nombre;
    private String valor;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "UserVars{" + "nombre=" + nombre + ", valor=" + valor + '}';
    }
    
    
}
