package com.smedia.sqzserver.common.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;



public class EncUtils {

	private static final char[] hexChars = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };

	public static String SHA(String s) {
	    return getDigest("SHA", s);
	}
	
	public static String SHA1(String s) {
        return getDigest("SHA-1", s);
    }
	
	private static String getDigest(String digest, String s) {
	    try {
            MessageDigest md = MessageDigest.getInstance(digest);
            md.update(s.getBytes(), 0, s.getBytes().length);
            byte[] hash = md.digest();
            StringBuilder sb = new StringBuilder();
            int msb;
            int lsb = 0;
            int i;
            for (i = 0; i < hash.length; i++) {
                msb = ((int) hash[i] & 0x000000FF) / 16;
                lsb = ((int) hash[i] & 0x000000FF) % 16;
                sb.append(hexChars[msb]);
                sb.append(hexChars[lsb]);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
	}

	public static String bytesToHex(byte[] b) {
		final char[] hex = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
		String str = "";

		for (int i = 0; i < b.length; i++) {
			int value = b[i];
			if (value < 0)
				value = 256 + value;
			str += hex[value / 16] + "" + hex[value % 16];
		}
		return str;
	}
}
