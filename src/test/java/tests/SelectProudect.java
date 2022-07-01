package tests;



import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.ElementForHomePage;
import Pages.ElementForSelectedProduct;
import Pages.authenticationPage;

public class SelectProudect extends TestBase{

	ElementForHomePage HomePageObject;
	authenticationPage authenticationobject;

	ElementForSelectedProduct ElementForLoginPageobject;

	@Test
	public void SelectProudectFromWomencateory() throws Exception {

		HomePageObject =new ElementForHomePage(driver);
		authenticationobject= new authenticationPage(driver);
		ElementForLoginPageobject=new ElementForSelectedProduct(driver);
		HomePageObject.SignIN();
		authenticationobject.NewUserSignIN();
		ElementForLoginPageobject.SelectProudect();

		Assert.assertEquals(ElementForLoginPageobject.history_state.getText(), "Here are the orders you've placed since your account was created.");


	}

}
