package week3.day1;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		String str1="stops";
		String str2="potss";
		
		if(str1.length()== str2.length()) {
			char[] charArray1 = str1.toCharArray();
			char[] charArray2 = str2.toCharArray();
			
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			
				if(Arrays.equals(charArray1, charArray2)) {
					System.out.println(str1+" is an anagram of "+str2);
				}
				else {
					System.out.println(str1+" is not an anagram of "+str2);
				}
			
			}
		else {
			System.out.println("Strings not equal length,hence not anagram.");
		}

	}

}
