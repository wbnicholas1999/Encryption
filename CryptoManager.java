/**
 *  
 *  Author: William Nicholas
 *  
 */

public class CryptoManager {
	
	private static final char LOWER_BOUND = ' ';
	private static final char UPPER_BOUND = '_';
	private static final int RANGE = UPPER_BOUND - LOWER_BOUND + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_BOUND and UPPER_BOUND characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	public static boolean stringInBounds (String plainText) {
		boolean ok = true;
		for (int i = 0; i < plainText.length(); i++) {
			if (!(charInBounds(plainText.charAt(i)))) {
				ok = false;
			}
		}
		return ok;
	}
	
	private static boolean charInBounds(char charAt) {
		if (charAt >= LOWER_BOUND && charAt <= UPPER_BOUND) 
			return true;
		else
			return false;
	}

	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	public static String encryptCaesar(String plainText, int key) {
		String encryptedText = "";
		
		if (stringInBounds(plainText)) {
			for (int i = 0; i < plainText.length(); i++) {
				char thisChar = plainText.charAt(i);
				int encryptedCharInt = ((int)thisChar + key);
				while (encryptedCharInt > UPPER_BOUND) {
					encryptedCharInt -= RANGE;
				}
				encryptedText += (char)encryptedCharInt;
			}
		}
		
		return encryptedText;
	}
	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	public static String encryptBellaso(String plainText, String bellasoStr) {
		String encryptedText = "";
		int bellasoStrLength = bellasoStr.length();
		
		for (int i = 0; i < plainText.length(); i++) {
			char thisChar = plainText.charAt(i);
			int encryptedCharInt = ((int)thisChar + (int)bellasoStr.charAt(i%bellasoStrLength));
			while (encryptedCharInt > UPPER_BOUND) {
				encryptedCharInt -= RANGE;
			}
			encryptedText += (char)encryptedCharInt;
		}
		
		return encryptedText;
	}
	
	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	public static String decryptCaesar(String encryptedText, int key) {
		String decryptedText = "";
		
		for (int i = 0; i < encryptedText.length(); i++) {
			char thisChar = encryptedText.charAt(i);
			int decryptedCharInt = ((int)thisChar - key);
			while (decryptedCharInt < LOWER_BOUND) {
				decryptedCharInt += RANGE;
			}
			decryptedText += (char)decryptedCharInt;
		}
		
		return decryptedText;
	}
	
	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
	public static String decryptBellaso(String encryptedText, String bellasoStr) {
		String decryptedText = "";
		int bellasoStrLength = bellasoStr.length();
		
		for (int i = 0; i < encryptedText.length(); i++) {
			char thisChar = encryptedText.charAt(i);
			int decryptedCharInt = ((int)thisChar - (int)bellasoStr.charAt(i%bellasoStrLength));
			while (decryptedCharInt < LOWER_BOUND) {
				decryptedCharInt += RANGE;
			}
			decryptedText += (char)decryptedCharInt;
		}
		
		return decryptedText;
	}
}