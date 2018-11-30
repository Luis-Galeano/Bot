package py.com.konecta.chatbot.ejb.macro;

import com.rivescript.macro.Subroutine;
import com.rivescript.util.StringUtils;

/**
 * An example object macro written in Java.
 *
 * To define a Java object macro, you must implement the interface
 * com.rivescript.ZzObjectMacro and register it using setSubroutine().
 *
 * This macro does two things: returns their message reversed, and sets
 * a user variable named `java`.
 *
 * This implements the `reverse` object macro used in Aiden/obj-java.rive
 *
 * See RSBot.java for more details.
 *
 * @author Noah Petherbridge
 */
public class ExampleMacro implements Subroutine {
        @Override
	public String call (com.rivescript.RiveScript rs, String[] args) {
		String message = StringUtils.join(args, " ");
		return new StringBuilder(message).reverse().toString();
	}
}
