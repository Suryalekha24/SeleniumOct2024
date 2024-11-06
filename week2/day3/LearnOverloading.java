package week2.day3;

public class LearnOverloading {
	public void reportStep(String msg,String status) {
		System.out.println("Print the message for first method:"+msg);
		System.out.println("Print the status for first method:"+status);
	}
	public void reportStep(String msg,String status,boolean snap) {
		System.out.println("Print the message for second method:"+msg);
		System.out.println("Print the status for second method:"+status);
		System.out.println("Print the screenshot state for second method:"+snap);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnOverloading lo = new LearnOverloading();
		lo.reportStep("Overloading", "success");
		lo.reportStep("Overloading method", "Success", false);
	}

}
