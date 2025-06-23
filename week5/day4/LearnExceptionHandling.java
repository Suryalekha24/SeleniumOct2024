package week5.day4;

public class LearnExceptionHandling {

	public static void main(String[] args) {
		int x=10;
		int y= 0;
//		int y= 2;
		int[] num= {1,2,3,4};
		
		try {
			System.out.println(x/y);
			System.out.println(num[4]);
		} catch (Exception e) {
			if(y==0) {
				System.out.println(x/1);
			}
			System.out.println(e);
		}
		System.out.println("done");

	}

}
