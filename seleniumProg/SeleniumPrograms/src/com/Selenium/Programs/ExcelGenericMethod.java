package com.Selenium.Programs;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


//Program to handle an empty row in excel document
public class ExcelGenericMethod 
{
	
	public static String getData(String Sheet,int row, int cell)
	{
		String val=" ";
		try
		{
			FileInputStream fis=new FileInputStream("./DataExcel/DataSheet.xls");
			Workbook wb=WorkbookFactory.create(fis);
			Cell c=wb.getSheet(Sheet).getRow(row).getCell(cell);
			val=c.getStringCellValue();
		}
		catch(Exception e)
		{
			System.out.println("unable to fetch the data");
		}
		return val;
	}

}
