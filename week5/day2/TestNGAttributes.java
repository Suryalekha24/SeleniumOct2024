package week5.day2;

import org.testng.annotations.Test;

public class TestNGAttributes {

	@Test(priority=1)
	public void createLead(){
		System.out.println("Create Lead done successsfully");

	}
	

	@Test(dependsOnMethods="week5.day2.TestNGAttributes.createLead",priority=-1)
	public void EditLead(){
		System.out.println("Edit Lead done successsfully");

	}


	@Test(invocationCount=2,priority=-1,invocationTimeOut=10000)
	public void mergeLead(){
		System.out.println("Merge Lead done successsfully");

	}

	@Test(timeOut=10000)
	public void deleteLead(){
		System.out.println("Delete Lead done successsfully");

	}
}
