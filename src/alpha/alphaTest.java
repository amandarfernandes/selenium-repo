/**
 * 
 */
package alpha;

import org.apache.logging.log4j.*;
/**
 * @author amandafernandes
 *
 */
public class alphaTest {

	/**
	 * @param args
	 */
	
	static final Logger log = LogManager.getLogger(alphaTest.class.getName());
	public static void main(String[] args) {
		log.debug("Debug Message");
		log.fatal("Fatal Error");
		log.error("ERROR!");
		log.info("Informational message");
	}

}
