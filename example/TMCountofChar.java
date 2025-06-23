package example;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class TMCountofChar {

	public static void main(String[] args) {
		/*
		 * HashMap<Character,Integer> hashmap= new HashMap<>();
		 * 
		 * String name = "Chennai Bangalore"; String[] words=name.split(" ");
		 * 
		 * 
		 * for (String str : words) { char[] ch = str.toCharArray(); for(Character
		 * c:ch){
		 * 
		 * if(hashmap.containsKey(c)){ hashmap.put(c,hashmap.get(c)+1); } else{
		 * hashmap.put(c,1); } } System.out.println(hashmap); }
		 */
		 String name = "Chennai Bangalore";
	        String[] words = name.split(" ");

	        for (String word : words) {
	            Map<Character, Integer> charCountMap = new LinkedHashMap<>();
	            for (char c : word.toCharArray()) {
//	                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
	            	if(charCountMap.containsKey(c)) charCountMap.put(c,charCountMap.get(c)+1);  else
	           		  charCountMap.put(c,1);
	            }
	            System.out.println("Map for \"" + word + "\": " + charCountMap);
	        }
	}

}