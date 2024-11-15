package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingCollec {

	public static void main(String[] args) {
		String str[]= {"HCL","Wipro","Aspire Systems","CTS"};
		List<String> compNames= new ArrayList<String>();
		for (int i = 0; i < str.length; i++) {
			compNames.add(str[i]);
		}
		Collections.sort(compNames);
		
		for (int i = compNames.size()-1; i >=0; i--) {
			String name = compNames.get(i);
			System.out.println(name);
		}
	}

}
