package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ElementForSelectedProduct extends PageBase {

	public ElementForSelectedProduct(WebDriver driver) {
		super(driver);

	}
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	WebElement Category;

	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[2]/a")
	WebElement Blouses;
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a")
	WebElement product;

	@FindBy(xpath  ="//*[@id=\"add_to_cart\"]/button")
	WebElement AddToCart;

	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
	WebElement Proceed_to_checkout;

	@FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]")
	WebElement Proceedtocheckout;

	@FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button")
	WebElement Proceedtocheckout_;

	@FindBy(id = "cgv")
	WebElement Terms;

	@FindBy(xpath = "//*[@id=\"form\"]/p/button")
	WebElement _Proceedtocheckout_;


	@FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
	WebElement BankWire;


	@FindBy(xpath = "//*[@id=\"cart_navigation\"]/button")
	WebElement confirmation;


	@FindBy(xpath = "//*[@id=\"center_column\"]/p/a")
	WebElement backToOrder;

	@FindBy(xpath = "//*[@id=\"center_column\"]/p")
	public WebElement history_state;


	public void SelectProudect() throws InterruptedException {

		Actions action = new Actions(driver);
		action.moveToElement(Category).perform();

		action.moveToElement(Blouses).click().perform();
		Thread.sleep(2000);

		product.click();
		Thread.sleep(2000);
		AddToCart.click();
		Thread.sleep(2000);
		Proceed_to_checkout.click();
		Thread.sleep(2000);
		Proceedtocheckout.click();
		Proceedtocheckout_.click();
		Terms.click();
		_Proceedtocheckout_.click();
		BankWire.click();
		confirmation.click();
		Thread.sleep(3000);
		backToOrder.click();



	}
}

