package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementForHomePage extends PageBase{

	public ElementForHomePage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath ="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	WebElement SignIN;
	
	
	public void SignIN() throws Exception {
		Thread.sleep(2000);
		SignIN.click();
		
	}
	

}
