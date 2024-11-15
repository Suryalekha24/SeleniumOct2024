package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		int num[]= {2,4,5,5,7,2,3,4,7};
		
		
		Set<Integer> unique=new TreeSet <Integer>();
		Set<Integer> duplicate=new LinkedHashSet<Integer>();
		
		for (int i = 0; i < num.length; i++) {
			boolean add = unique.add(num[i]);
			
			if(!add)
			{
				duplicate.add(num[i]);
			}
		}
		System.out.println(unique);
	}

}
