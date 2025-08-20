package example;
import java.util.*;
public class HashExample {
	

	    public static void main(String[] args) {
	        HashMap<Character,Integer> hashmap= new HashMap<>();
	        hashmap.put('c',1);
	        hashmap.put('s',2);
	        hashmap.put('r',3);
//	        for(Entry<Character,Integer> each:hashmap.EntrySet())
	        System.out.println(hashmap);
//	        System.out.println(each.getKey()+"->"+each.getValue());
	    }
}
