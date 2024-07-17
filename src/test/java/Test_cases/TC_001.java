package Test_cases;

import org.testng.annotations.Test;
import TestBase.BaseClass;
import page_Objects.educationsalary;
import page_Objects.homePage;
import page_Objects.needassesment;
import page_Objects.personalinformation;
import page_Objects.selectdesiregoal;

public class TC_001 extends BaseClass{
	
	@Test
	public void drp() throws InterruptedException 
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
				
				personalinformation p = new personalinformation(driver);
				//p.female_btn();
				Thread.sleep(5000);
				// p.member_name();
     			p.mem_dob();
     			Thread.sleep(5000);
     			getAllOptions(p.getMonth(),"Apr");
     			getAllOptions(p.getYear(),"1998");
     			getdateoption(p.getDate(),"19");
    			// p.smokeroption();
				// p.mem_email();
				// p.mem_mobile();
				p.chechbox();
				Thread.sleep(5000);
				p.proceed_btn();
				educationsalary e = new educationsalary(driver);
				e.educationdrp();
				//getdateoption(e.getEducationitem(),"10th Pass/SSC");
				Thread.sleep(2000);
				e.getOccupation();
				//getdateoption(e.getoccupationitem(),"Agriculture");
				e.getAnnualincome();
				//getdateoption(e.getannualincomeitems(),"10 lacs To < 15 lacs");
				Thread.sleep(2000);
				e.proceedbtn();
				selectdesiregoal sd = new selectdesiregoal(driver);
				sd.productselection();
				sd.recommendatiobtn();
				Thread.sleep(2000);	
			}
}
