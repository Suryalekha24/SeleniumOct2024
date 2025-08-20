package week1.day3;

import java.util.Arrays;

public class PrintArrayWODup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int orgnArr[]= {4,1,3,2,5,6,4,2,1,4,5};
				int resArr[]=removeDuplicates(orgnArr);
				for (int i = 0; i < resArr.length; i++) {
					System.out.println(resArr[i]);
				}
	}
	public static int[] removeDuplicates(int[] arr) {
	    int n = arr.length;
	    int[] temp = new int[n];
	    int j = 0;
	    temp[j++] = arr[0];
	    for (int i = 1; i < n; i++) {
	        boolean seen = false;
	        for (int k = 0; k < j; k++) {
	            if (temp[k] == arr[i]) {
	                seen = true;
	                break;
	            }
	        }
	        if (!seen) {
	            temp[j++] = arr[i];
	        }
	    }
	    return Arrays.copyOf(temp, j);
	}

}
