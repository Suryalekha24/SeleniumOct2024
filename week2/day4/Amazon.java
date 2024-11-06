package week2.day4;

public class Amazon extends CanaraBank{
	
	
	
	@Override
	public void cardPayments() {
		// TODO Auto-generated method stub
		System.out.println("Card PAyments implemented in Amazon class");
	}

	@Override
	public void recordPaymentDetails() {
		System.out.println("record Payment Details implemented in Amazon class");
		
	}
	public static void main(String[] args) {
		Amazon am =new Amazon();
		am.cashOnDelivery();
		am.upiPayments();
		am.cardPayments();
		am.recordPaymentDetails();
		am.internetBanking();
	}

}
