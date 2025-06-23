package scripts;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DupStringArray {
	public static void main(String[] args) {
		 
        // String Arrays
        String[] strArrays = {
                "Cabbage",
                "Kale",
                "Radish",
                "Kale",
                "Garlic",
                "Beetroot",
                "Garlic",
                "Carrot",
                "Kale"
        };
 
        // First convert to List
        List<String> list = Arrays.asList(strArrays);
 
        //3. just empty HashSet object
        Set<String> set = new HashSet<String>();
 
        // iterate through List
        for(String str : list) {
            // add element to Set/HashSet
            boolean flagForDuplicate = set.add(str);
 
            if(!flagForDuplicate) {
                System.out.println(str + " is duplicate element");
            
              /*  // 3.after creating empty set4. Iterate using enhanced for-each loop
                for (int index = 0; index < list.size(); index++) {
         
                    // 5. add element to Set
                    boolean flagForDuplicate = set.add(list.get(index));
         
                    // 6 print index-position of duplicates
                    if(!flagForDuplicate) {
                        System.out.println("Duplciate " + list.get(index) 
                        + " at " + index + " index-position"); */
            } 
        }
    }
}
