/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.konecta.chatbot.ejb.model;

/**
 *
 * @author Luis Galeano
 */
public class Trigger {
    
    private String mensaje;
    private String codigoUsuario;
    
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    @Override
    public String toString() {
        return "Trigger{" + "mensaje=" + mensaje + ", codigoUsuario=" + codigoUsuario + '}';
    }

    
    
}
