package week2.day3;

public class Chrome extends Browser{
	public void openIncognito() {
		System.out.println("Open Chrome in Incognito mode");
	}
	public void clearCache() {
		System.out.println("Clear cache in chrome");
	}
	public static void main(String[] args) {
		
		Chrome cr= new Chrome();
		cr.openURL();
		cr.openIncognito();
		cr.navigateBack();
		cr.clearCache();
		cr.closeBrowser();
		System.out.println("Browser name:"+cr.browserName);
		System.out.println("Browser version:"+cr.browserVersion);
		
	}
}
