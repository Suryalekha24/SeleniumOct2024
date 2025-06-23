package scripts;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DupInEachValue {

	public static void main(String[] args) {
		String[] strArrays = {
                "Cabbage",
                "Kalle",
                "Radish",
               "Carrot"};
		List<String> list = Arrays.asList(strArrays);
		for (String str : list) {
			String result = removeDuplicates(str);
			
//			System.out.println("Original String: " + inputString);
	        System.out.println("String after removing duplicates: " + result);
		}
       
	}
	public static String removeDuplicates(String input) {
        HashSet<Character> uniqueChars = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (uniqueChars.add(ch)) {
                // Character is unique, 
                  // add it to the result
                result.append(ch);
            }
        }

        return result.toString();
    }
}
