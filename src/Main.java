
import facebook4j.Facebook;
import facebook4j.*;
import facebook4j.FacebookFactory;
import facebook4j.auth.AccessToken;
import java.io.IOException;
//import facebook4j.internal.logging.Logger;
import java.util.logging.*;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author brbr
 */
public class Main {
  //private final static Logger logger = Logger.getLogger("Main");
  private static final String appId = "528528921012854";
	private static final String secretId = "7a0715854fd52c5c1dd6daed2252e046";
	private static final String accsToken = "EAAHgsbqXKnYBAKOMfwvtAU95DcGknBf9V9ZAbg9MfrsVHAQquQ8NZBZA6vflosJ25iucuF79AJXCsIGY5AnGMKPgXj3eAAB9QsTon8dvtXAYkZAWZBzk0C55VaEHx0wTYIF6FaA4DXtcEI6UHqhj900zu1fPeGO2oElKEPoWXUKSZBGqzeC5uAIy8KVRZAkmokZD";
  //private final static Logger LOG_RAIZ = Logger.getLogger("bitacora");
  //private final static Logger LOGGER = Logger.getLogger("bitacora.Bitacora");
  private final static Logger logger = Logger.getLogger("Main");

  
  /**
   * @param args the command line arguments
   * @throws facebook4j.FacebookException
   * @throws java.io.IOException
   */
  public static void main(String[] args) throws FacebookException, IOException {
    Facebook facebook = new FacebookFactory().getInstance();
    facebook.setOAuthAppId(appId, secretId);
    facebook.setOAuthAccessToken(new AccessToken(accsToken, null));
    
    Handler consoleHandler = new ConsoleHandler();
    Handler fileHandler = new FileHandler("./bitacora.log", false);
    SimpleFormatter simpleFormatter = new SimpleFormatter();
    fileHandler.setFormatter(simpleFormatter);
    logger.addHandler(consoleHandler);
    logger.addHandler(fileHandler);
    consoleHandler.setLevel(Level.ALL);
    fileHandler.setLevel(Level.ALL);
    
    logger.log(Level.INFO, "Fin del programa");
    System.out.println("Program END");
    }

    
  
}
