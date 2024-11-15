package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingEle {

	public static void main(String[] args) {
		int [] num= {1,2,3,4,10,6,8};
		List<Integer> list = new ArrayList<Integer>();
		
		for (Integer value : num) {
			list.add(value);
		}
		Collections.sort(list);
		for (int i = 0; i < list.size()-1; i++) {
			int current=list.get(i);
			int next= list.get(i+1);
			
			if ((current+1)!=next) {
				for (int j = current+1; j < next; j++) {
					System.out.println(j);
				}
				
			}
		}
		
		}

	}

