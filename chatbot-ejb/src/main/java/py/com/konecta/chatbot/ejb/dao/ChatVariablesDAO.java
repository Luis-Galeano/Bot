package py.com.konecta.chatbot.ejb.dao;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import org.mybatis.cdi.Mapper;
import py.com.konecta.chatbot.ejb.mapper.ChatVariablesMapper;
import py.com.konecta.chatbot.ejb.model.ChatVariables;
import py.com.konecta.chatbot.ejb.model.ChatVariablesExample;

@RequestScoped
public class ChatVariablesDAO extends GenericDAO<ChatVariables, Long, ChatVariablesExample, ChatVariablesMapper> {
    @Inject
    @Mapper
    private ChatVariablesMapper mapper;

    @Override
    public ChatVariablesMapper getMapper() {
        return mapper;
    }
}