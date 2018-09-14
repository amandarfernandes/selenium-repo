/**
 * 
 */
package alpha;

import org.apache.logging.log4j.*;
/**
 * @author amandafernandes
 *
 */
public class testalpha {

	/**
	 * @param args
	 */
	
	static final Logger log = LogManager.getLogger(alphaTest.class.getName());
	public static void main(String[] args) {
		log.debug("alphatest2 Debug Message");
		log.fatal("alphatest2 Fatal Error");
		log.error("alphatest2 ERROR!");
		log.info("alphatest2 Informational message");
	}

}
