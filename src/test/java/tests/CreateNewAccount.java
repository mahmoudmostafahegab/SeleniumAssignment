package tests;

import org.testng.annotations.Test;

import Pages.ElementForHomePage;
import Pages.authenticationPage;
import Pages.elementforUserInformationPage;

public class CreateNewAccount extends TestBase{
	
	ElementForHomePage HomePageObject;
	authenticationPage authenticationobject;
	elementforUserInformationPage UserInformationobject;
	@Test
	public void CreatenewUser() throws Exception {
		
		HomePageObject =new ElementForHomePage(driver);
		
		authenticationobject= new authenticationPage(driver);
		
		UserInformationobject =new elementforUserInformationPage(driver);
		
		HomePageObject.SignIN();
		
		authenticationobject.createAnAccount();
		
		UserInformationobject.enterUserInformation();
		
	}

}
