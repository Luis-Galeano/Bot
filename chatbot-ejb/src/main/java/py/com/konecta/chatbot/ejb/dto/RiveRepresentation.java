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
public class RiveRepresentation {
    
    private String trigger;
    private String reply;
    private String topics;
    private List<String> conditions;

    public String getTrigger() {
        return trigger;
    }

    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public String getTopics() {
        return topics;
    }

    public void setTopics(String topics) {
        this.topics = topics;
    }

    public List<String> getConditions() {
        return conditions;
    }

    public void setConditions(List<String> conditions) {
        this.conditions = conditions;
    }

    @Override
    public String toString() {
        return "RiveRepresentation{" + "trigger=" + trigger + ", reply=" + reply + ", topics=" + topics + ", conditions=" + conditions + '}';
    }

}
