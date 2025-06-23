package scripts;

import java.util.HashMap;
import java.util.Iterator;

public class CountNumOfCharInString {
	
	static void CharacterCount(String inputString) {
		HashMap<Character,Integer> hashmap= new HashMap<>();
		char[] strArray=inputString.toCharArray();
		
		for (char c : strArray) {
			if (hashmap.containsKey(c)) {
				hashmap.put(c,hashmap.get(c)+1);
			} else {
				hashmap.put(c, 1);
			}
		}
		System.out.println(hashmap);
		}

	public static void main(String[] args) {

		CharacterCount("MyNewLife");

	}

}
