package py.com.konecta.chatbot.ejb.macro;

import com.rivescript.macro.Subroutine;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import py.com.konecta.chatbot.ejb.bean.BotBean;

@RequestScoped
public class AgregarVariableMacro implements Subroutine {
    
    @EJB
    BotBean botBean;
    
    private final Logger logger = LogManager.getLogger(this.getClass());
    @Override
    public String call (com.rivescript.RiveScript rs, String[] args) {
        return botBean.agregarVaribalesUsuario(args);
    }
}
