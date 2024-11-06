package week2.day3;

public class Safari extends Browser {
	public void readerMode() {
		System.out.println("Reader mode in Safari");
	}
	public void fullScreenMode() {
		System.out.println("Full screen in Safari");
	}
	public static void main(String[] args) {
		Safari sf=new Safari();
		sf.openURL();
		sf.navigateBack();
		sf.readerMode();
		sf.fullScreenMode();
		sf.closeBrowser();
		System.out.println("Browser name:"+sf.browserName);
		System.out.println("Browser version:"+sf.browserVersion);
	}
}
