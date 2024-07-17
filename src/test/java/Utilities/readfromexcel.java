package Utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readfromexcel {
	FileInputStream file;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	String path;
	public readfromexcel(String path)
	{
		this.path=path;
	}
	public int getrowcount(String sheetname) throws IOException
	{
		file = new FileInputStream(path);
		wb = new XSSFWorkbook(file);
		sheet = wb.getSheet(sheetname);
		int row=sheet.getLastRowNum();
		wb.close();
		file.close();
		return row;
	}
	
	public int getcellcount(String sheetname, int row) throws IOException
	{
		file = new FileInputStream(path);
		wb = new XSSFWorkbook(file);
		sheet = wb.getSheet(sheetname);
		XSSFRow row1=sheet.getRow(row);
		int cell=row1.getLastCellNum();
		wb.close();
		file.close();
		return cell;
	}
	public String getcelldata(String sheetname, int row, int cell) throws IOException
	{
		file = new FileInputStream(path);
		wb = new XSSFWorkbook(file);
		sheet = wb.getSheet(sheetname);
		XSSFRow row1=sheet.getRow(row);
		XSSFCell cellno = row1.getCell(cell);
		String data;
		DataFormatter formatter  = new DataFormatter();
		try
		{
			data=formatter.formatCellValue(cellno);
		}
		catch(Exception e)
		{
			data=" ";
		}
		wb.close();
		file.close();
		return data;
		
	}
	
	public void writeToExcel(String sheetname,int rowno, String data) throws IOException
	{
		file = new FileInputStream(path);
		wb = new XSSFWorkbook(file);
		sheet = wb.getSheet(sheetname); 
		XSSFRow row = sheet.getRow(rowno);
		XSSFCell cellcreate = row.createCell(12);
		cellcreate.setCellValue(data);
		FileOutputStream out = new FileOutputStream(path);
		wb.write(out);
		wb.close();
		file.close();
	}

}
