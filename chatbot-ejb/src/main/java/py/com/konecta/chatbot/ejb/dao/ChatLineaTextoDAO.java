package py.com.konecta.chatbot.ejb.dao;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import org.mybatis.cdi.Mapper;
import py.com.konecta.chatbot.ejb.mapper.ChatLineaTextoMapper;
import py.com.konecta.chatbot.ejb.model.ChatLineaTexto;
import py.com.konecta.chatbot.ejb.model.ChatLineaTextoExample;

@RequestScoped
public class ChatLineaTextoDAO extends GenericDAO<ChatLineaTexto, Long, ChatLineaTextoExample, ChatLineaTextoMapper> {
    @Inject
    @Mapper
    private ChatLineaTextoMapper mapper;

    @Override
    public ChatLineaTextoMapper getMapper() {
        return mapper;
    }
}