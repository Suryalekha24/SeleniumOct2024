package week6.day1;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer {

	int count =0;
	//default value of this method is false
	public boolean retry(ITestResult result) {
		if (count<2) {
			count++;
		}
		return true;// minimum 3 times it gets executed
	}

}
