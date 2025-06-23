package example;

import java.util.StringTokenizer;

public class DummyExample {

	public static void main(String[] args) {
		/*
		 * String name="My name is Suryalekha";
		 * 
		 * String[] str=name.split(" "); for (String s : str) { System.out.print(s); }
		 */
		 
		String s="1234**24Apr25**c345**Surya";
		/*StringTokenizer t = new StringTokenizer(s,"**");
		while (t.hasMoreTokens()) {
			System.out.println(t.nextToken());*/
			String[] arr = s.split("\\**");
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
			}
		}

