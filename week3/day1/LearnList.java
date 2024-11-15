package week3.day1;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		//Declare empty list
		List <String> mentors = new ArrayList <String>();
		List <String> coach = new ArrayList <String>();
		
		coach.add("Babu");
		System.out.println(coach);
				
		//add items
		mentors.add("Anburaj");
		mentors.add("Mukesh");
		mentors.add("Muthu");
		mentors.add("Kathir");
		System.out.println(mentors);
		mentors.add(2,"Bhuvanesh");
		System.out.println(mentors);
		coach.addAll(mentors);
		System.out.println(coach);
		
		//size of list
		int size = mentors.size();
		System.out.println(size);
		
		//retrieve value
		String string = mentors.get(4);
		System.out.println(string);
		
		//remove an item from list
		String remove = mentors.remove(2);
		System.out.println(remove);
		
		//clear
		mentors.clear();// return type is void
		System.out.println(mentors);
		
		
	}

}
