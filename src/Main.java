
import facebook4j.Facebook;
import facebook4j.*;
import facebook4j.FacebookFactory;
import facebook4j.auth.AccessToken;

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


  /**
   * @param args the command line arguments
   * @throws facebook4j.FacebookException
   */
  public static void main(String[] args) throws FacebookException {
    Facebook facebook = new FacebookFactory().getInstance();
    facebook.setOAuthAppId(appId, secretId);
    facebook.setOAuthAccessToken(new AccessToken(accsToken, null));
    
    
    System.out.println("Program END");
  }
  
}
