package page_Objects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class productrecommendation extends baseConstructor{
	
	WebDriver driver;
	
	public productrecommendation(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//div[@class='product_box']//p[2]")
	private List<WebElement> productlist;
	
	public List<WebElement> productsuggestion()
	{
		return productlist;
	}
	

}
