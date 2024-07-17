package Utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;


public class dataprovider {

	@DataProvider(name="form1")
	public String[][] getdata() throws IOException
	{
		String path="C:\\Users\\Admin\\eclipse-workspace\\seleniumByPawanKumar\\SBILife.co.in\\src\\test\\resources\\DataRead.xlsx";
		readfromexcel r = new readfromexcel(path);
		int totalrow = r.getrowcount("Sheet1");
		int totalcell=r.getcellcount("Sheet1",2);
		
		String logindata[][]= new String[totalrow][totalcell];
		
		for(int i=1; i<=totalrow; i++)
		{
			for(int j=0; j<totalcell; j++)
			{
				logindata[i-1][j]=r.getcelldata("Sheet1",i, j);
			}
		}
		return logindata;
	}
}
