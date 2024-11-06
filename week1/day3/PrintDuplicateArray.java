	package week1.day3;

import java.util.Arrays;

public class PrintDuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {2,7,5,7,3,2,5,9};
		
		int arrLength = num.length;
		System.out.println(arrLength);
		Arrays.sort(num);
		
		for (int i = 0; i < num.length-1; i++) {
			if(num[i]==num[i+1]) {
				System.out.println("Duplicate values are:"+num[i]);
			}
				
		}
	}

}
