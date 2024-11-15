package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindInterList {

	public static void main(String[] args) {
		
		int arr1[]= {3,2,11,4,6,7};
		int arr2[]= {1,2,8,4,9,7};
		
		List<Integer> lst1 = new ArrayList<Integer>();
		
		for (int i = 0; i < arr1.length; i++) {
			lst1.add(arr1[i]);
		}
		
		List<Integer> lst2 = new ArrayList<Integer>();
		for (int i = 0; i < arr2.length; i++) {
			lst2.add(arr2[i]);
		}
		
		Collections.sort(lst1);
		Collections.sort(lst2);
		
		System.out.println(lst1);
		System.out.println(lst2);
		
		for (int i = 0; i <= lst1.size()-1; i++) {
			for (int j = 0; j <=lst2.size()-1; j++) {
				if(lst1.get(i)==lst2.get(j))
					System.out.println("Matching elements in both list"+lst2.get(j));
			}
		}
		
	}

}
