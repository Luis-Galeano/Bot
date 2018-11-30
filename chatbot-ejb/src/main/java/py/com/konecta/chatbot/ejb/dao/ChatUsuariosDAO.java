package py.com.konecta.chatbot.ejb.dao;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import org.mybatis.cdi.Mapper;
import py.com.konecta.chatbot.ejb.mapper.ChatUsuariosMapper;
import py.com.konecta.chatbot.ejb.model.ChatUsuarios;
import py.com.konecta.chatbot.ejb.model.ChatUsuariosExample;

@RequestScoped
public class ChatUsuariosDAO extends GenericDAO<ChatUsuarios, Long, ChatUsuariosExample, ChatUsuariosMapper> {
    @Inject
    @Mapper
    private ChatUsuariosMapper mapper;

    @Override
    public ChatUsuariosMapper getMapper() {
        return mapper;
    }
}