package one1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		
		String baseUrl ="https:\\chromedriver.chromium.org/downloads";
		
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumSoftware\\chromedriver_108\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(baseUrl);
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("ChromeDriver 108.0.5359.125")).click();
		Thread.sleep(3000);
		
		Set<String> allHandles = driver.getWindowHandles();
		
		for (String handle : allHandles) {
			System.out.println(handle);
			
		}
		

	}

}
