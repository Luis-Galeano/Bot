package py.com.konecta.chatbot.ejb.dao;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import org.mybatis.cdi.Mapper;
import py.com.konecta.chatbot.ejb.mapper.ChatRiveDirectoryMapper;
import py.com.konecta.chatbot.ejb.model.ChatRiveDirectory;
import py.com.konecta.chatbot.ejb.model.ChatRiveDirectoryExample;

@RequestScoped
public class ChatRiveDirectoryDAO extends GenericDAO<ChatRiveDirectory, Long, ChatRiveDirectoryExample, ChatRiveDirectoryMapper> {
    @Inject
    @Mapper
    private ChatRiveDirectoryMapper mapper;

    @Override
    public ChatRiveDirectoryMapper getMapper() {
        return mapper;
    }
}