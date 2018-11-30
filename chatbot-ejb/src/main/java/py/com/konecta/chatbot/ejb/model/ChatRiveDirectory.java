package py.com.konecta.chatbot.ejb.model;

import java.io.Serializable;

public class ChatRiveDirectory implements Serializable {
    private Long idRiveDirectory;

    private Long idRol;

    private String directory;

    private static final long serialVersionUID = 1L;

    public Long getIdRiveDirectory() {
        return idRiveDirectory;
    }

    public void setIdRiveDirectory(Long idRiveDirectory) {
        this.idRiveDirectory = idRiveDirectory;
    }

    public Long getIdRol() {
        return idRol;
    }

    public void setIdRol(Long idRol) {
        this.idRol = idRol;
    }

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", idRiveDirectory=").append(idRiveDirectory);
        sb.append(", idRol=").append(idRol);
        sb.append(", directory=").append(directory);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}