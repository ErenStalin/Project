package automated_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeTextBoxEqual {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		int h1 = driver.findElement(By.id("username")).getSize().getHeight();
		int w1 = driver.findElement(By.name("pwd")).getSize().getWidth();
		int h2 = driver.findElement(By.id("username")).getSize().getHeight();
		int w2 = driver.findElement(By.name("pwd")).getSize().getWidth();
		if(h1==h2&&w1==w2) 
			System.out.println("The Height and width of username and password are equal");
		else
			System.out.println("The Height and width of username and password are not equal");
		driver.close();
	}
}