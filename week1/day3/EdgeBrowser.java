package week1.day3;

public class EdgeBrowser {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Browser eobj= new Browser();
		String edgBrowser = eobj.launchBrowser("Edge");
		System.out.println(edgBrowser);
		eobj.loadUrl();
	}

}
