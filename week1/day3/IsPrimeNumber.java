package week1.day3;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n = 13;
			boolean bPrime = true;
			
			for (int i = 2; i <=n-1; i++) 
			{
				if (n%i==0) {
					bPrime = false;
				}
			}
			
			if (bPrime==true) {
				System.out.println("Number is Prime");
			} else {
				System.out.println("Number is not prime");
			}
	}

}
