package page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class selectdesiregoal extends baseConstructor {
	
WebDriver driver;
	
	public selectdesiregoal(WebDriver driver)
	{
		super(driver);
	}
	
	public void plansname(WebDriver driver, String key)
	{
		WebElement plan=driver.findElement(By.xpath("//div[@data-id='"+key+"']"));
		plan.click();
	}
	@FindBy(xpath="//p[text()='Wealth Creation / Savings With Insurance']")
	private WebElement product;
	
	public void productselection()
	{
		product.click();
	}

	@FindBy(xpath="//span[text()='Product Recommendation']")
	private WebElement recommendation;
	
	public void recommendatiobtn()
	{
		recommendation.click();
	}
}
