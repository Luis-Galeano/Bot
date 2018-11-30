package py.com.konecta.chatbot.ejb.model;

import java.io.Serializable;

public class ChatVariables implements Serializable {
    private Long idVariable;

    private String nombre;

    private static final long serialVersionUID = 1L;

    public Long getIdVariable() {
        return idVariable;
    }

    public void setIdVariable(Long idVariable) {
        this.idVariable = idVariable;
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
        sb.append(", idVariable=").append(idVariable);
        sb.append(", nombre=").append(nombre);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}