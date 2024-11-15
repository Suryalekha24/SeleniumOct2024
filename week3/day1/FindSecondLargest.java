package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		int array1[]= {3, 2, 11, 4, 6, 7};
		
		List<Integer> list1 = new ArrayList<Integer>();
		
		for (int i = 0; i < array1.length; i++) {
			list1.add(array1[i]);
		}
		
			Collections.sort(list1);
			System.out.println(list1);
		
			Integer value = list1.get(list1.size()-2);
			System.out.println("Second largest number in list:"+value);
	}

}
