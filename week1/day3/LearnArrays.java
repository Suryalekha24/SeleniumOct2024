package week1.day3;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int scores [] = {65,72,83,99,100};
//		length
		int length = scores.length;
		System.out.println(length);
		System.out.println(scores[3]);
		Arrays.sort(scores);
		System.out.println("Min value is "+scores[0]);
		System.out.println("Max value is "+scores[length-1]);
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
	}

}
