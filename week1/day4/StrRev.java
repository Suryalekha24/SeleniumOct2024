package week1.day4;

public class StrRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Suryalekha";
		int length = name.length();
		System.out.println(length);
		char[] charArray = name.toCharArray();
		System.out.println(charArray);
		for (int i = charArray.length-1 ; i >=0; i--) {
		System.out.print(charArray[i]);	
		}
	}

}
