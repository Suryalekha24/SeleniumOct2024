package example;

public class MathRandomEx {
	
	    public static void main(String[] args) {
	        double randomDouble = Math.random();
	        System.out.println("Random double using Math.random(): " + randomDouble);

	        // To get an integer within a range (e.g., 0 to 100 inclusive)
	        int randomInt = (int) (Math.random() * 101);
	        System.out.println("Random int (0-100) using Math.random(): " + randomInt);
	    }
	}
