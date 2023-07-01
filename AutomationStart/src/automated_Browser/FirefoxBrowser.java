//package automated_Browser;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//public class FirefoxBrowser {
//	static {
//		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
//	}
//	public static void main(String[] args) {
//		WebDriver driver=new FirefoxDriver();
//		driver.get("https://www.amazon.in/");
//		String title = driver.getTitle();
//		System.out.println(title);
//	}
//}