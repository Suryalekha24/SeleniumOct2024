package week1.day3;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=0,num2=1;
		int num3,range =8;
		
		System.out.println("Fibonacci series:");
		System.out.print(num1+","+num2);
		
		for (int i = 2; i <range;i++) {
			num3=num1+num2;
			System.out.print(","+num3);
			num1=num2;
			num2=num3;
		}
	}

}
