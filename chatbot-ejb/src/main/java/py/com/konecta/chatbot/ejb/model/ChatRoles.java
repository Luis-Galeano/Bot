package py.com.konecta.chatbot.ejb.model;

import java.io.Serializable;

public class ChatRoles implements Serializable {
    private Long idRol;

    private String nombre;

    private static final long serialVersionUID = 1L;

    public Long getIdRol() {
        return idRol;
    }

    public void setIdRol(Long idRol) {
        this.idRol = idRol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", idRol=").append(idRol);
        sb.append(", nombre=").append(nombre);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}