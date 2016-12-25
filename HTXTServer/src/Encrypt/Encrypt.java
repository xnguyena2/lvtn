package Encrypt;

import org.jasypt.util.text.StrongTextEncryptor;

public class Encrypt {

	static public String encrypt(String key, String plainText){
		StrongTextEncryptor textEncryptor = new StrongTextEncryptor();
		textEncryptor.setPassword(key);
		String myEncryptedText = textEncryptor.encrypt(plainText);
		return myEncryptedText;
	}
	
	static public String decrypt(String key, String cipherText){
		String plainText = null;
		try{
		StrongTextEncryptor textEncryptor = new StrongTextEncryptor();
		textEncryptor.setPassword(key);
		plainText = textEncryptor.decrypt(cipherText);
		}catch(Exception es){
			System.out.println(es);
		}
		return plainText;
	}
}
