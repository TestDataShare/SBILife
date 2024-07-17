package page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class needassesment extends baseConstructor{
	
	public needassesment(WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(xpath="//div[@id='start_box']//child::img")
	private WebElement nxt_btn;
	
	public void nxt_btn1()
	{
		nxt_btn.click();
	}
	
	@FindBy(xpath="(//div[@class='top_content']//child::p)")
	private WebElement heading1;
	
	public String headingnxtpage()
	{
     try
     {
 		return heading1.getText();
 		
     }
     catch(Exception e)
     {
    	 return e.getMessage();
     }
	}

}
