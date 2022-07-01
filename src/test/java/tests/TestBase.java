package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	public static WebDriver driver;
	@BeforeSuite
	public void Openchrome() throws Exception {
		
		String path = System.getProperty("user.dir");
		System.out.println(path);  
		System.setProperty("webdriver.chrome.driver",  path+"\\ChromeDriver\\chromedriver.exe");
		driver =new ChromeDriver();
		
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
	}
	
	@AfterSuite
	public void Closechrome() throws Exception{
		Thread.sleep(5000);
		driver.close();


	}
}
