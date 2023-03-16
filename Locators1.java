package one1;
hello
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {

	public static void main(String[] args) {
		
		String baseUrl = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";


        System.setProperty("webdriver.chrome.driver","D:\\SeleniumSoftware\\chromedriver_108\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

         driver.get(baseUrl);
         
         String currentUrl = driver.getCurrentUrl();
 		 System.out.println(currentUrl); 
 		 
         driver.findElement(By.cssSelector("input#ctl00_MainContent_username")).sendKeys("Tester");
         driver.findElement(By.cssSelector("input[type='password']")).sendKeys("test");
         driver.findElement(By.cssSelector("input.button[type='submit']")).click();
         driver.findElement(By.linkText("Logout")).click();
         
         driver.close();
         
	}

}
