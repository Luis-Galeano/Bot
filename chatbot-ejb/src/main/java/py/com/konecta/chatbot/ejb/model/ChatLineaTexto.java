package py.com.konecta.chatbot.ejb.model;

import java.io.Serializable;
import java.util.Date;

public class ChatLineaTexto implements Serializable {
    private Long idLineaTexto;

    private String idUsuario;

    private Long idTransporte;

    private Date fecha;

    private String direccion;

    private String lineaTexto;

    private static final long serialVersionUID = 1L;

    public Long getIdLineaTexto() {
        return idLineaTexto;
    }

    public void setIdLineaTexto(Long idLineaTexto) {
        this.idLineaTexto = idLineaTexto;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Long getIdTransporte() {
        return idTransporte;
    }

    public void setIdTransporte(Long idTransporte) {
        this.idTransporte = idTransporte;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLineaTexto() {
        return lineaTexto;
    }

    public void setLineaTexto(String lineaTexto) {
        this.lineaTexto = lineaTexto;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", idLineaTexto=").append(idLineaTexto);
        sb.append(", idUsuario=").append(idUsuario);
        sb.append(", idTransporte=").append(idTransporte);
        sb.append(", fecha=").append(fecha);
        sb.append(", direccion=").append(direccion);
        sb.append(", lineaTexto=").append(lineaTexto);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}