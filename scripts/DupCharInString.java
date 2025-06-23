package scripts;

import java.util.HashMap;
import java.util.Set;

public class DupCharInString {
	
	static void DuplicateChar(String inputString) {
		HashMap<Character,Integer> hash_map=new HashMap<>();
		char[] strArray=inputString.toCharArray();
		
		for (char c : strArray) {
			if (hash_map.containsKey(c)) {
				hash_map.put(c, hash_map.get(c)+1);
			} else {
				hash_map.put(c, 1);
			}
		}
		Set<Character>keys =hash_map.keySet();
		for (Character ch : keys) {
			if (hash_map.get(ch)>1) {
				System.out.println(ch+"-->"+hash_map.get(ch));
			}
		}
	}

	public static void main(String[] args) {
		
		DuplicateChar("capgeminicareer");
	}

}
