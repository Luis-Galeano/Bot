/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.konecta.chatbot.ejb.dto;

import java.util.List;

/**
 *
 * @author Luis Galeano
 */
public class RiveResponse {
    
    private List<RiveRepresentation> data;

    public List<RiveRepresentation> getData() {
        return data;
    }

    public void setData(List<RiveRepresentation> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "RiveResponse{" + "data=" + data + '}';
    }
    
}
