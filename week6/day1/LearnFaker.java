package week6.day1;

import com.github.javafaker.Faker;
import com.github.javafaker.Name;

public class LearnFaker {

	public static void main(String[] args) {
		Faker fake= new Faker();
		String firstName = fake.name().firstName();
		System.out.println(firstName);
		String cname = fake.company().name();
		System.out.println(cname);
	}

}
