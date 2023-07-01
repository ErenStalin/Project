package automated_Browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int count = links.size();
		System.out.println(count);
		for(int i=0;i<count;i++) {         
			String text = links.get(i).getText();
			System.out.println(text);
		}

		WebDriver driver1=new ChromeDriver();
		driver1.navigate().to("https://www.flipkart.com/");
		driver1.manage().window().maximize();
		List<WebElement> links1 = driver1.findElements(By.tagName("a"));
		int count1=links.size();
		System.out.println(count1);
		for(int j=0;j<count1;j++) {
			String text1 = links1.get(j).getText();
			System.out.println(text1);
		}
		driver.quit();
		driver1.quit();
	}
}