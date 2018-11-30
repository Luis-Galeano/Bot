package py.com.konecta.chatbot.ejb.dao;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import org.mybatis.cdi.Mapper;
import py.com.konecta.chatbot.ejb.mapper.ChatRolesMapper;
import py.com.konecta.chatbot.ejb.model.ChatRoles;
import py.com.konecta.chatbot.ejb.model.ChatRolesExample;

@RequestScoped
public class ChatRolesDAO extends GenericDAO<ChatRoles, Long, ChatRolesExample, ChatRolesMapper> {
    @Inject
    @Mapper
    private ChatRolesMapper mapper;

    @Override
    public ChatRolesMapper getMapper() {
        return mapper;
    }
}