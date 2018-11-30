package py.com.konecta.chatbot.ejb.model;

import java.io.Serializable;

public class ChatUsuariosVariables implements Serializable {
    private Long idUsuarioVariable;

    private Long idUsuario;

    private Long idVariable;

    private String valor;

    private static final long serialVersionUID = 1L;

    public Long getIdUsuarioVariable() {
        return idUsuarioVariable;
    }

    public void setIdUsuarioVariable(Long idUsuarioVariable) {
        this.idUsuarioVariable = idUsuarioVariable;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Long getIdVariable() {
        return idVariable;
    }

    public void setIdVariable(Long idVariable) {
        this.idVariable = idVariable;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", idUsuarioVariable=").append(idUsuarioVariable);
        sb.append(", idUsuario=").append(idUsuario);
        sb.append(", idVariable=").append(idVariable);
        sb.append(", valor=").append(valor);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}