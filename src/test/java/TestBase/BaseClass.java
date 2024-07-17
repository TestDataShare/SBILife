package TestBase;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;
import Utilities.readfrompeorperties;
public class BaseClass extends readfrompeorperties{

	public static WebDriver driver;
	
	@BeforeClass
	public void startbrowser() throws IOException
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("----disable-notifications");
		driver = new ChromeDriver(option);
		driver.manage().deleteAllCookies();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(readfrom("URL"));
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void closebrowser()
	{
		driver.close();
	}
	
	public void movetoelement(WebDriver driver,WebElement ele)
	{
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
	}
	
	public String captureScreen(String tname) throws IOException {

		//String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
				
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\" + tname + "_ .png";
		File targetFile=new File(targetFilePath);
		sourceFile.renameTo(targetFile);
		return targetFilePath;
	}
	
	
	public static void getAllOptions(WebElement dropdownElement,String text1) {
	       List<String> optionsList = new ArrayList<String>();
	       try {
	           Select select = new Select(dropdownElement);
	           List<WebElement> options = select.getOptions();
	           for(int i=0; i<options.size(); i++)
	           {
	        	   if(options.get(i).getText().equals(text1))
	        	   {
	        		   System.out.println(options.get(i).getText());
	        		   options.get(i).click();
	        		   break;
	        	   }
	           }
	       } catch (Exception e) {
	           e.printStackTrace(); // For logging
	       }
	   }
     public static void getdateoption(List<WebElement> elm,String txt)  //list of webelement use for bootstrap dorpdown, to select date 
      {
	       for(int i=0; i<elm.size(); i++)
	       {
	    	   if(elm.get(i).getText().equals(txt))
	    	   {
	    		   elm.get(i).click();
	    		   break;
	    	   }
	       }
      } 
//     public String productList(List<WebElement> elm)  //list of webelement use for bootstrap dorpdown, to select date 
//     {
//    	 String txt11="";
//	       for(int i=0; i<elm.size(); i++)
//	       {   
//	    		   txt11=elm.get(i).getText(); 
//	       }
//		return txt11;
//     }  
     
     public void frames(WebDriver driver, WebElement ele)
     {
    	 driver.switchTo().frame(ele);
     }
     public void defaultframe(WebDriver driver)
     {
    	 driver.switchTo().defaultContent();
     }
     public void newwindow(WebDriver driver)
     {
    	 driver.switchTo().newWindow(WindowType.TAB);
     }
     
    public void doubltclick(WebDriver driver,WebElement ele)
    {
    	Actions a = new Actions(driver);
    	a.doubleClick(ele).build().perform();
    }
    public void contextclick(WebDriver driver,WebElement ele)
    {
    	Actions a = new Actions(driver);
    	a.contextClick(ele).build().perform();
    }
    
    public void draganddrop(WebDriver driver, WebElement source, WebElement dest)
    {
    	Actions a = new Actions(driver);
    	a.dragAndDrop(source,dest).build().perform();
    }
    public void refresh(WebDriver driver)
    {
    	driver.navigate().refresh();
    }
    public void backward(WebDriver driver)
    {
    	driver.navigate().back();
    }
    public void forward(WebDriver driver)
    {
    	driver.navigate().forward();
    }
    public void alertAccept(WebDriver driver)
    {
    	driver.switchTo().alert().accept();
    }
    public void alertDismiss(WebDriver driver)
    {
    	driver.switchTo().alert().dismiss();
    }
    public String getAlertText()
    {
    	String text = driver.switchTo().alert().getText();
    	return text;
    }
    public void textToAlert(WebDriver driver, String text)
    {
    	driver.switchTo().alert().sendKeys(text);
    }
    public void elementTagName(WebElement Element)
    {
    	Element.getTagName();
    }
    public void maximizeWindow(WebDriver driver)
    {
    	driver.manage().window().maximize();
    }
    public void minimizeWindow(WebDriver driver)
    {
    	driver.manage().window().minimize();
    }
}
