package Demo;

import org.apache.logging.log4j.*;

public class LoggginDemoFirst {
	
   private static Logger demoLogger = LogManager.getLogger(LoggginDemoFirst.class.getName)
	public static void main(String[] args) {
	
		   demoLogger.info("click successfull");
		   demoLogger.error("click successfull");
		   demoLogger.debug("click successfull");
		   demoLogger.fatal("click successfull");

	}

}
