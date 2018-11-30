package py.com.konecta.chatbot.ejb.model;

import java.io.Serializable;
import java.util.Date;

public class ChatUsuarios implements Serializable {
    private Long idUsuario;

    private String idCuentaUsuario;

    private String nombre;

    private String apellido;

    private String telefono;

    private String email;

    private String ubicacion;

    private Date ultimaConversacion;

    private static final long serialVersionUID = 1L;

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getIdCuentaUsuario() {
        return idCuentaUsuario;
    }

    public void setIdCuentaUsuario(String idCuentaUsuario) {
        this.idCuentaUsuario = idCuentaUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Date getUltimaConversacion() {
        return ultimaConversacion;
    }

    public void setUltimaConversacion(Date ultimaConversacion) {
        this.ultimaConversacion = ultimaConversacion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", idUsuario=").append(idUsuario);
        sb.append(", idCuentaUsuario=").append(idCuentaUsuario);
        sb.append(", nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append(", telefono=").append(telefono);
        sb.append(", email=").append(email);
        sb.append(", ubicacion=").append(ubicacion);
        sb.append(", ultimaConversacion=").append(ultimaConversacion);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}