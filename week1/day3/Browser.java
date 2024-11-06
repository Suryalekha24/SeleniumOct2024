package week1.day3;

public class Browser {

	public String launchBrowser(String browserName){
		System.out.println("Browser launched successfully");
		return browserName;
	}
	
	void loadUrl() {
		System.out.println("Application URL loaded successfully");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser objBrowser = new Browser();
		String lBrowser = objBrowser.launchBrowser("Chrome");
		System.out.println(lBrowser);
		objBrowser.loadUrl();
	}

}
