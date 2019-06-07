
import facebook4j.Facebook;
import facebook4j.*;
import facebook4j.FacebookFactory;
import facebook4j.auth.AccessToken;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
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
  
  private static final String appId = "528528921012854";
	private static final String secretId = "7a0715854fd52c5c1dd6daed2252e046";
	private static final String accsToken = "EAAHgsbqXKnYBAKOMfwvtAU95DcGknBf9V9ZAbg9MfrsVHAQquQ8NZBZA6vflosJ25iucuF79AJXCsIGY5AnGMKPgXj3eAAB9QsTon8dvtXAYkZAWZBzk0C55VaEHx0wTYIF6FaA4DXtcEI6UHqhj900zu1fPeGO2oElKEPoWXUKSZBGqzeC5uAIy8KVRZAkmokZD";
  private final static Logger logger = Logger.getLogger("Main");
  private static final String APP_VERSION = "v1.0";
  
  
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
    int opt = 1;
    
    System.out.format("Facebook command line %s\n\n", APP_VERSION) ;
    //Menu
    while(opt != 0 ){
      //Imprimir menu
      System.out.println("opciones:");
      System.out.println("1-> opt uno");
      System.out.println("2-> opt dos");
      
      //get option
      opt = getUsrIn(2);
      System.out.println(opt);
      
      //switch
      switch (opt){
        case 1:
          System.out.println("Uno!");
          break;
        
        case 2:
          System.out.println("Dos!");
          
      }
      
      opt = 0;
    }
    
    enterp();
    
    logger.log(Level.INFO, "Fin del programa");
    //System.out.println("Program END");
    }
  
    /**
    * obtener la entrada del usario limitando su respuesta
    * a un numero mayor que cero pero menor que @param n
    * 
    * @param n int numero de opciones disponibles
    * @return     * 
     */
    public static int getUsrIn(int n){
      Scanner in = new Scanner(System.in);
      int inp = 0;
      while(inp == 0){
      System.out.println("Ingresa un número mayor que 0 y menor que " + Integer.toString(n + 1) );
        try{
          inp = in.nextInt();
        }catch(InputMismatchException e ){
          System.out.println("Debes ingresar un número mayor que 0 y menor que " + Integer.toString(n + 1) );
          in.next();
          inp = 0;
        }
        if(inp < 0|| inp > n ){ inp = 0; }
      }
      return inp;
    }

    /**
     * pausar hasta que se presione "Enter"
     */
    public static void enterp(){
      System.out.println("Press Enter to continue");
      try{System.in.read();}
      catch(Exception e){}
    }
  
  
}
