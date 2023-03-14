package one1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	public static void main(String[] args) {
		String baseUrl = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";


        System.setProperty("webdriver.chrome.driver","D:\\SeleniumSoftware\\chromedriver_108\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

         driver.get(baseUrl);
         driver.findElement(By.cssSelector("input.txt")).sendKeys("Tester");
//         driver.findElement(By.cssSelector("input#ctl00_MainContent_password")).sendKeys("test");
         driver.findElement(By.cssSelector("input.txt[type='password']")).sendKeys("test");
//         driver.findElement(By.cssSelector("input[value='Login']")).click();
         driver.findElement(By.cssSelector("input.button[value='Login']")).click();
         
         System.out.print(driver.getTitle());
         driver.findElement(By.linkText("Logout")).click();
         driver.quit();
         
    

	}

}
