package scripts;

import java.util.Arrays;

public class RemoveDupInArr {

	static int removeDupElements(int[] arr) {
		
		if (arr.length == 0)
		return 0;
		
		Arrays.sort(arr);
		
		int j = 0;
		for (int i = 1; i < arr.length; i++) {
		if (arr[i] != arr[j]) {
		j++;
		arr[j] = arr[i];
		}
		}
		return j + 1;
		}

		public static void main(String[] args) {

		int[] array = { 3, 2, 1, 1, 2, 2, 3, 2, 1, 3 };
		int n= removeDupElements(array);
		for (int i = 0; i < n; i++) {
			System.out.println(array[i]+" ");
		}
		
		}


}
