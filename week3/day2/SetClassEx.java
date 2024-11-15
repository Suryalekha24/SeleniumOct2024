package week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;


public class SetClassEx {

	public static void main(String[] args) {
		String companyName="google";
		Set<Character> unique=new LinkedHashSet <Character>();
		char[] charArray = companyName.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			unique.add(charArray[i]);
		}
		System.out.println(unique);
	}

}
