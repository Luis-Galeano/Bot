package py.com.konecta.chatbot.ejb.dao;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import org.mybatis.cdi.Mapper;
import py.com.konecta.chatbot.ejb.mapper.ChatUsuariosVariablesMapper;
import py.com.konecta.chatbot.ejb.model.ChatUsuariosVariables;
import py.com.konecta.chatbot.ejb.model.ChatUsuariosVariablesExample;

@RequestScoped
public class ChatUsuariosVariablesDAO extends GenericDAO<ChatUsuariosVariables, Long, ChatUsuariosVariablesExample, ChatUsuariosVariablesMapper> {
    @Inject
    @Mapper
    private ChatUsuariosVariablesMapper mapper;

    @Override
    public ChatUsuariosVariablesMapper getMapper() {
        return mapper;
    }
}