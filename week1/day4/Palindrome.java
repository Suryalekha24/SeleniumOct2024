package week1.day4;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int num=12321;
			int rem,revNum=0;
			int temp=num;
			
			while(num>0) {
				rem=num%10;
				revNum=revNum*10+rem;
				num/=10;
			}
			if (temp==revNum) {
				System.out.println("Number is Palindrome");
			} else {
				System.out.println("Number is not palindrome");
			}
	}

}
