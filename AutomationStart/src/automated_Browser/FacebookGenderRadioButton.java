package automated_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookGenderRadioButton {
	static {
		System.setProperty( "webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(3000);
		int female = driver.findElement(By.xpath("(//input[@type='radio'])[1]")).getLocation().getY();
		int male = driver.findElement(By.xpath("(//input[@type='radio'])[2]")).getLocation().getY();
		int custom = driver.findElement(By.xpath("(//input[@type='radio'])[3]")).getLocation().getY();
		if(female==male&&female==custom)
			System.out.println("Radio buttons are aligned properly");
		else
			System.out.println("Radio buttons are not aligned properly");
		driver.close();
	}

}
