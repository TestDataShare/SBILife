package Test_cases;

import org.testng.annotations.Test;
import TestBase.BaseClass;
import Utilities.dataprovider;
import page_Objects.educationsalary;
import page_Objects.homePage;
import page_Objects.needassesment;
import page_Objects.personalinformation;
import page_Objects.selectdesiregoal;

public class TC_002 extends BaseClass{
	@Test(dataProvider="form1", dataProviderClass=dataprovider.class)
	public void drp(String gend,String name1,String month,String yy, String dd,String smo,String email1, String mb,String edu,String Occ,String inc,String plan) throws InterruptedException 
	{
				homePage hp = new homePage(driver);
				movetoelement(driver,hp.getProducts());
				hp.need_btn();
				Thread.sleep(5000);
				needassesment nd =  new needassesment(driver);
				String tst=nd.headingnxtpage();
				if(tst.equals("Steps towards your"))
				{
					nd.nxt_btn1();
					System.out.println("Landed to Assesment page Successfully");
				}
				else
				{
					System.out.println("Not assesmsnt page");
				}
				
				try
				{
					personalinformation p = new personalinformation(driver);
					p.gender(driver,gend);
					p.member_name(name1);
					p.mem_dob();
					getAllOptions(p.getMonth(),month);
					Thread.sleep(5000);
					getAllOptions(p.getYear(),yy);
					Thread.sleep(5000);
					getdateoption(p.getDate(),dd);
					Thread.sleep(5000);
					p.smokeroption(driver,smo);
					Thread.sleep(5000);
					p.mem_email(email1);
					p.mem_mobile(mb);
					p.chechbox();
					p.proceed_btn();
					educationsalary e = new educationsalary(driver);
					e.educationdrp();
					e.educationdetails(driver, edu);
					e.getOccupation();
					e.occupationdrp(driver, Occ);
					e.getAnnualincome();
					e.incomedetails(driver, inc);
					e.proceedbtn();
					selectdesiregoal sd = new selectdesiregoal(driver);
					sd.plansname(driver, plan);
					Thread.sleep(3000);
					sd.recommendatiobtn();
					driver.navigate().to("https://www.sbilife.co.in/");
				}catch(Exception e)
				{
					e.getMessage();
				}
				
			}
}

