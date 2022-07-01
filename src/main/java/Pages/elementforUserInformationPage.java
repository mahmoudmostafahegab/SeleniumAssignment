package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class elementforUserInformationPage extends PageBase{

	public elementforUserInformationPage(WebDriver driver) {
		super(driver);



	}

	@FindBy(css  ="#id_gender1")
	WebElement Title;
	@FindBy(id="customer_firstname")
	WebElement firstName;
	@FindBy(id="customer_lastname")
	WebElement lastName;
	@FindBy(id="passwd")
	WebElement password;
	
	@FindBy(id="firstname")
	WebElement first_Name;
	@FindBy(id="lastname")
	WebElement last_Name;
	
	@FindBy(id="company")
	WebElement company;
	@FindBy(id="address1")
	WebElement address;
	@FindBy(id="city")
	WebElement city;
	@FindBy(id="postcode")
	WebElement postcode;
	@FindBy(id="phone")
	WebElement phone;
	@FindBy(id="submitAccount")
	WebElement submitAccount;
	
	public void enterUserInformation() throws InterruptedException  {
		Thread.sleep(3000);
		Title.click();
		firstName.sendKeys("Adam");
		lastName.sendKeys("mark");
		password.sendKeys("12345");
	   
		first_Name.sendKeys("Adam");
		last_Name.sendKeys("mark");
		company.sendKeys("TESTCompany");
		address.sendKeys("testAddress");
		city.sendKeys("testcity");
		Thread.sleep(2000);

		Select state =new Select(driver.findElement(By.xpath("//*[@id=\"id_state\"]")));
		state.selectByVisibleText("Florida");
		
		postcode.sendKeys("11572");
		phone.sendKeys("010165565");
		
		submitAccount.click();

	}
}
