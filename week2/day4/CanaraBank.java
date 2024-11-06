package week2.day4;

public abstract class CanaraBank implements Payments{

	public void cashOnDelivery() {
		System.out.println("Cash On Delivery implemented in CanaraBank class");
	}
	public void upiPayments()
	{
		System.out.println("UPI Payments implemented in CanaraBank class");
	}
	public  void internetBanking() {
		System.out.println("Internet Banking implemented in CanaraBank class");
	}
	public abstract void recordPaymentDetails();
	
	
}
