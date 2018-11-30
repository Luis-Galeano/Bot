package py.com.konecta.chatbot.ejb.macro;

import com.rivescript.macro.Subroutine;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class SumaMacro implements Subroutine {
     private final Logger logger = LogManager.getLogger(this.getClass());
	public String call (com.rivescript.RiveScript rs, String[] args) {
            
            for(int i=0;i<args.length;i++){
                logger.info("{}",args[i]+"\n");
            }
            
            Integer suma = 8+5;
            return suma.toString();
	}
}
