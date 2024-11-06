package week2.day3;

public class Edge extends Browser {
	public void openURL() {
		System.out.println("Open URL in Edge browser as overridden method");
	}
	public void takeSnap(){
		System.out.println("Take a screenshot in Edge");
		}
	public void clearCookies() {
		System.out.println("Clear cookies in Edge");
	}
	public static void main(String[] args) {
		Edge eg= new Edge();
		eg.openURL();
		eg.navigateBack();
		eg.closeBrowser();
		eg.takeSnap();
		eg.clearCookies();
		System.out.println("Browser name:"+eg.browserName);
		System.out.println("Browser version:"+eg.browserVersion);
	}
}
