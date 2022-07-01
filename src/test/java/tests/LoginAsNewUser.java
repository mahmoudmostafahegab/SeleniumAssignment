package tests;

import org.testng.annotations.Test;

import Pages.ElementForHomePage;
import Pages.authenticationPage;

public class LoginAsNewUser extends TestBase{
	ElementForHomePage HomePageObject;
	authenticationPage authenticationobject;
	
	@Test
	public void SignInASANewUser() throws Exception {
		
		
		HomePageObject =new ElementForHomePage(driver);
		authenticationobject= new authenticationPage(driver);
		
		HomePageObject.SignIN();
		authenticationobject.NewUserSignIN();
		
		
	}

}
