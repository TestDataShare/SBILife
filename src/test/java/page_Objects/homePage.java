package page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage extends baseConstructor{
	
	public homePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//li[@id='navbar-menu-2']//child::h3[contains(text(),'PRODUCTS')]") // for moverhover action require getter method
	private WebElement products;
	
	public WebElement getProducts() {
		return products;
	}
	
	@FindBy(xpath="(//ul[@class='sub-menus']//child::a[text()='Need Assessment'])[2]")
	private WebElement need_ass;
	
	public void need_btn()
	{
		need_ass.click();
	}
}
