package page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class educationsalary extends baseConstructor{

WebDriver driver;
	
	public educationsalary(WebDriver driver)
	{
		super(driver);
	}
	
	public void educationdetails(WebDriver driver, String key)
	{
		WebElement education = driver.findElement(By.xpath("//div[@class='select-items']//div["+key+"]"));
		education.click();
	}
	@FindBy(xpath="(//div[@class='select-selected'])[1]")
	private WebElement education;

	public void educationdrp()
	{
		education.click();
	}
	
//	@FindBy(xpath="//div[@class='select-items']//div")
//	private List<WebElement> educationitem;
//	
//	public List<WebElement> getEducationitem() {
//		return educationitem;
//	}
	
	public void occupationdrp(WebDriver driver, String key)
	{
		WebElement occupatin= driver.findElement(By.xpath("//div[@class='select-items']//div["+key+"]"));
		occupatin.click();
	}
	
	@FindBy(xpath="(//div[@class='select-selected'])[2]")
	private WebElement occupation;

	public void getOccupation() {
		occupation.click();
	}
//	@FindBy(xpath="//div[@class='select-items']//div")
//	private List<WebElement> occupationitem;
//	
//	public List<WebElement> getoccupationitem() {
//		return occupationitem;
//	}

	
	public void incomedetails(WebDriver driver, String key)
	{
		WebElement income= driver.findElement(By.xpath("//div[@class='select-items']//div["+key+"]"));
		income.click();
	}
	
	@FindBy(xpath="(//div[@class='select-selected'])[3]")
	private WebElement annualincome;

	public void getAnnualincome() {
		annualincome.click();
	}
//	@FindBy(xpath="//div[@class='select-items']//div")
//	private List<WebElement> annualincomeitems;
//	
//	public List<WebElement> getannualincomeitems() {
//		return annualincomeitems;
//	}
	
	@FindBy(xpath="//button[@id='proceedBtn2']")
	private WebElement proceed;
	
	public void proceedbtn()
	{
		proceed.click();
	}
	
	

	
	

}
