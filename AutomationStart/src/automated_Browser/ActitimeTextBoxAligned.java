package automated_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeTextBoxAligned {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		int x = driver.findElement(By.id("username")).getLocation().getX();
		int x1 = driver.findElement(By.name("pwd")).getLocation().getX();

		if(x==x1)
			System.out.println("Aligned properly");
		else
			System.out.println("not propered aligned");
		driver.close();
	}
}