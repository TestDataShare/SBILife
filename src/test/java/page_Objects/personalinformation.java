package page_Objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class personalinformation extends baseConstructor {
	WebDriver driver;
	
	public personalinformation(WebDriver driver)
	{
		super(driver);
	}
	
	 public void gender(WebDriver driver,String key) // dynamic xpath
     {
    	 WebElement gen = driver.findElement(By.xpath("//input[@id='g_"+key+"']"));
    	 gen.click();
     }
	 
	 public void smokeroption(WebDriver driver,String key)
	 {
		 WebElement opt=driver.findElement(By.xpath("//img[@data-val='"+key+"']"));
		 opt.click();
	 }

//	@FindBy(xpath="//div[@class='gender_text']//p[contains(text(),'Male')]")  // fixed xpath
//	private WebElement male;
//	
//	@FindBy(xpath="//div[@class='gender_text']//p[contains(text(),'Female')]")
//	private WebElement female;
//	
//	@FindBy(xpath="//div[@class='gender_text']//p[contains(text(),'Third Gender')]")
//	private WebElement thirdper;
	
	@FindBy(xpath="//input[@id='txtName']")
	private WebElement name;
	
	@FindBy(xpath="//input[@id='mem_datepicker']")
	private WebElement dob;
	
	@FindBy(xpath="//input[@id='txtEmailID']")
	private WebElement email;
	
	@FindBy(xpath="//input[@id='txtMobileNo']")
	private WebElement mobile;
	
	@FindBy(xpath="//button[@id='proceedBtn']")
	private WebElement proceed;
	
	@FindBy(xpath="//input[@id='checkConsent']")
	private WebElement chkbx;
	
//	@FindBy(xpath="//div[@class='smoker-item']")
//	private WebElement smoker;
//	
//	@FindBy(xpath="//div[@class='smoker-item smokerselected']")
//	private WebElement nonsmoker;
	
	@FindBy(xpath="//select[@class='ui-datepicker-month']")
	private WebElement month;
	
	public WebElement getMonth() {
		return month;
	}
	
	@FindBy(xpath="//select[@class='ui-datepicker-year']")
	private WebElement year;
	
	public WebElement getYear() {
		return year;
	}
	
	@FindBy(xpath="//table[@class='ui-datepicker-calendar']//td")
	private List<WebElement> date;
		
	public List<WebElement> getDate() {
		return date;
	}
//	public void male_btn(String key)
//	{
//		male.submit();
//	}
//	public void female_btn()
//	{
//		female.click();
//	}
//	public void third_gender()
//	{
//		thirdper.click();
//	}
	public void member_name(String name1)
	{
		name.sendKeys(name1);
	}
	public void mem_dob()
	{
		dob.click();
	}
	public void mem_email(String email1)
	{
		email.sendKeys(email1);
	}
	public void mem_mobile(String mb)
	{
		mobile.sendKeys(mb);
	}
	public void proceed_btn()
	{
		proceed.click();
	}
	public void chechbox()
	{
		chkbx.click();
	}
//	public void smokeroption()
//	{
//		smoker.click();
//	}
//	public void nonsmokeroption()
//	{
//		nonsmoker.click();
//	}
}
