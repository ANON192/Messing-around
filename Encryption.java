
public class Encryption {
	
	private static final String key = "¼ÌJTð³¡±8o?ßÄ-KkpZÓá*;	¿2{RÞNÛSw?ú¶^ç?+íýùsè?Bä§<?G·ð?Ð?ðàè{ht¬ýÜ?iÕ?1¹kçÈÆâ²ÎÑ`©=a²>Ì?Å9ÙÀ?";
	
	public static String xorEncrypt(String s1){
		
		String done = "";
		
		
		char [] charArray = new char [s1.length()];
		
		charArray = s1.toCharArray();
		for(int i = 0; i < charArray.length; i++){
			int temp = ((int)charArray[i]) ^ (int)key.charAt(i);
			charArray[i] = (char)temp;
		}
		
		//System.out.println(132 ^ 122);
		return new String(charArray);
		
	}
	
	
	
	
	public static String encryptThis(String s1){
		
		StringBuilder done2 = new StringBuilder();
		char charArray[] = new char [s1.length()];

		charArray = s1.toCharArray();
		
		for(int i = 0; i < s1.length(); i++){
			int letter = charArray[i];
			letter++;
			charArray[i] = (char)letter;
			done2.append((char)letter);
		}
		
		s1 = done2.toString();
		
		return s1;
	}
	
	
	
	
	public static String decryptThis(String s1){
		
		String done = "";
		StringBuilder done2 = new StringBuilder();
		char charArray[] = new char [s1.length()];

		charArray = s1.toCharArray();
		
		for(int i = 0; i < s1.length(); i++){
			int letter = charArray[i];
			letter--;
			charArray[i] = (char)letter;
			done2.append((char)letter);
		}
		
		done = done2.toString();
		
		return done;
	}
	
	
	
	

	public static void main(String[] args) throws Exception {
		for(int i = 0; i < 100; i++){
			//System.out.print((char)(Math.random() * 256));
		}
		//System.out.println();
		
		
		String s1 = "f";
		String s2 = "Hi this is 1 message! ";
		
		System.out.println(s1 + "  and  " + s2);
		

		s1 = xorEncrypt(s1);
		s2 = xorEncrypt(s2);
		
		System.out.println(s1 + "  and  " + s2);
		
		
		s1 = xorEncrypt(s1);
		s2 = xorEncrypt(s2);
		
		System.out.println(s1 + "  and  " + s2);

		
	}

	
}
