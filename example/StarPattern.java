package example;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
		for (int i = 1; i <=rows; ++i) {
//		for(int i=rows;i>=1;--i) {
			for (int j = 1; j <=i; ++j) {
				System.out.print(i);
			}
			System.out.println(" ");
		}
	}

}
