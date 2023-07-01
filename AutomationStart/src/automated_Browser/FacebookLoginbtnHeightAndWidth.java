package automated_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginbtnHeightAndWidth {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		int height = driver.findElement(By.name("login")).getSize().getHeight();
		int width = driver.findElement(By.name("login")).getSize().getWidth();
		System.out.println("Height = "+height+" width = "+width);
		driver.close();
	}
}