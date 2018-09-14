/**
 * 
 */
package beta;

import org.apache.logging.log4j.*;

import alpha.alphaTest;
/**
 * @author amandafernandes
 *
 */
public class betaTest {

	/**
	 * @param args
	 */
	
	static final Logger log = LogManager.getLogger(alphaTest.class.getName());
	public static void main(String[] args) {
		log.debug("BETA Debug Message");
		log.fatal("BETA Fatal Error");
		log.error("BETA ERROR!");
		log.info("Beta Informational message");
	}

}
