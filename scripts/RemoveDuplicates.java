package scripts;

import java.util.HashSet;

public class RemoveDuplicates {
	 public static String removeDuplicates(String input) {
	        HashSet<Character> uniqueChars = new HashSet<>();
	        StringBuilder result = new StringBuilder();
	        char[] charArray = input.toCharArray();
	        for (char ch : charArray) {
	            if (uniqueChars.add(ch)) {
	                // Character is unique, 
	                  // add it to the result
	                result.append(ch);
	            }
	        }

	        return result.toString();
	    }

	    public static void main(String[] args) {
	        String inputString = "HelloWorld";
	        String result = removeDuplicates(inputString);

	        System.out.println("Original String: " + inputString);
	        System.out.println("String after removing duplicates: " + result);
	    }

}
