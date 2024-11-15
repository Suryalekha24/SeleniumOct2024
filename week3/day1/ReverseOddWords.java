package week3.day1;

public class ReverseOddWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] word = test.split(" ");
		String  temp="";
		String newStr=" ";
		
		for (int i = 0; i < word.length; i++) {
			if(i%2!=0) {
				char[] charArray = word[i].toCharArray();
				for (int j = charArray.length-1; j >=0 ; j--) {
					temp=temp+charArray[j];
				}
				word[i]=temp;
			}
		}
		for (int i = 0; i < word.length; i++) {
			newStr=newStr+word[i]+" ";		
		}
		System.out.println(newStr);
	}

}
