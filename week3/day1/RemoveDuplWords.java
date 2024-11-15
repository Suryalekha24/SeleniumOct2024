package week3.day1;

public class RemoveDuplWords {

	public static void main(String[] args) {
		String text = "We learn Java basics as part of java sessions in java week1";
		int count=0;
		String newStr="";
		
		String[] words = text.split(" ");
		
		for (int i = 0; i < words.length; i++) {
			for (int j = i+1; j < words.length; j++) {
				boolean bStatus = words[i].equalsIgnoreCase(words[j]);
				if (bStatus) {
					count=count+1;
					words[j]=" ";
				}		
			}
		}
		if (count>0) {
			for (int i = 0; i < words.length; i++) {
				newStr=newStr+words[i]+" ";
			}
			System.out.println(newStr);
		}
	}

}
