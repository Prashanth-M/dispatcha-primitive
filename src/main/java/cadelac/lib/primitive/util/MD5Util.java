package cadelac.lib.primitive.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Util {

	  public static String encode(final String in) throws NoSuchAlgorithmException {
		  final MessageDigest md = MessageDigest.getInstance("MD5");
	      final byte[] digest = md.digest(in.getBytes());
	      
		  StringBuffer hexString = new StringBuffer();
		  for (int i=0;i<digest.length;i++) {
		      hexString.append(Integer.toHexString(0xFF & digest[i]));
		  }
	      return hexString.toString();
	  }

	   

	  
}
