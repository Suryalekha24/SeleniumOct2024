package week3.day1;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
		 String test = "changeme";
		char[] charArray = test.toCharArray();
		 for (int i = 0; i <=test.length()-1 ; i++) {
			if (i%2==0) {
				charArray[i] = Character.toLowerCase(charArray[i]);			
			}
			else {
				charArray[i] = Character.toUpperCase(charArray[i])	;			
			}
			
		}
		 System.out.println(charArray);
	}

}
