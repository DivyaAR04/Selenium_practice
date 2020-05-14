package com.Selenium.Programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;
//program is not working and even no errors are shown

public class ExcelCopyContentThirdFile 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream(new File("./DataExcel/DataSheet.xls"));
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
		
		FileInputStream fis1=new FileInputStream(new File("./DataExcel/DataSheet1.xls"));
		Workbook wb1=WorkbookFactory.create(fis1);
		Sheet sh1=wb.getSheet("Sheet1");
		
		FileOutputStream fis2=new FileOutputStream(new File("./DataExcel/DataSheet4.xls"));
		Workbook wb2=WorkbookFactory.create(fis2);
	    Sheet sh2=wb2.getSheet("Sheet1");
		
		
		
		int rc=sh.getLastRowNum();
		int rc1=sh1.getLastRowNum();
		for(int i=0;i<=rc;i++)
		{
			Row row=sh.getRow(i);
			Row row1=sh1.getRow(i);
			try
			{
				short cc=row.getLastCellNum();
				short cc1=row1.getLastCellNum();
				for(int j=0;j<=cc;j++)
				{
					Cell cell=row.getCell(j);
					Cell cell1=row1.getCell(j);
					try
					{
						String val=cell.getStringCellValue();
						String val1=cell1.getStringCellValue();
						
						if(!val.equals(val1))
						{	
							Row r2=sh2.createRow(i);
							Cell c2=r2.createCell(j);
							c2.setCellValue(val);
							wb2.write(fis2);
						}
						
						else
						{
							System.out.println("values are matching");
						}
					}	
					catch(Exception e)
					{
						System.out.println("");
					}
				}
			}
			catch(Exception e)
			{
				System.out.println("");
				}
			}
	}

}
