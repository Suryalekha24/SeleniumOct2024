package example;

public class LargestArray {

	public static void main(String[] args) {
	
		        int[] numbers = {5, 34, 78, 2, 45, 1, 99, 23};
		        int max = numbers[0]; // Start with the first element

		        for (int i = 1; i < numbers.length; i++) {
		            if (numbers[i] > max) {
		                max = numbers[i];
		            }
		        }

		        System.out.println("Largest element is: " + max);
		    }

	}
