package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class authenticationPage extends PageBase{

	public authenticationPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(id = "email_create")
	WebElement EmailTextBox;
	@FindBy(id="SubmitCreate")
	WebElement CreateButton;
	
	@FindBy(id = "email")
	WebElement email;
	@FindBy(id="passwd")
	WebElement password;
	
	@FindBy(id="SubmitLogin")
	WebElement signIn;
	
	public void createAnAccount() throws Exception {
		Thread.sleep(2000);
		EmailTextBox.sendKeys("m600245980b@catdogmail.live");
		CreateButton.click();
		Thread.sleep(2000);
		
	}
	
	public void NewUserSignIN() {
		
		email.sendKeys("m600245980b@catdogmail.live");
		password.sendKeys("12345");
		signIn.click();
	
		
	}
	
	
	
	
}
