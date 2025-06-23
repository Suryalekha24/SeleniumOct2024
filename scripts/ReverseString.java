package scripts;

public class ReverseString {
	 
	    public static String reverseString(String str) {  
	        StringBuilder sb = new StringBuilder(str);  
	        return sb.reverse().toString();  
	    }  
	    public static void main(String[] args) {  
	        String str = "Hello World!";  
	        System.out.println("Original String is " + str);  
	        System.out.print(" Reversed String is ");  
	  
	        String reversed = reverseString(str);  
	        System.out.println(reversed);  
	    }  
	}  
