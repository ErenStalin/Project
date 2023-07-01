package automated_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginButton {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		boolean loginbutton = driver.findElement(By.name("login")).isEnabled();
		if(loginbutton==true)
			System.out.println("LoginButton is enabled");
		else
			System.out.println("LoginButton is not enabled");
		driver.close();
	}
}