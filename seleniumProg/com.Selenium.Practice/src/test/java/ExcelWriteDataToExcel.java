import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteDataToExcel 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		/*FileInputStream fis = new FileInputStream(new File("./DataExcel/DataSheet1.xls"));
		
		  File fis=new File("./DataExcel/DataSheet1.xls");
		
		Workbook wb=WorkbookFactory.create(fis);
		
	    Sheet sh=wb.getSheet("Sheet1");
		Row r=sh.createRow(3);
		Cell c=r.createCell(1);
		String value=c.setCellValue("Selenium");		
		sh.createRow(0).createCell(0).setCellValue("Selenium");
		FileOutputStream fout=new FileOutputStream("./DataExcel/DataSheet1.xls");
		wb.write(fout);*/
		
	/*	File file=new File("./DataExcel/DataSheet1.xls");
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sh=wb.createSheet("Sheet1");
		sh.createRow(0).createCell(0).setCellValue("Selenium");
		
		try
		{
			FileOutputStream fos=new FileOutputStream(file);
			wb.write(fos);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
		
		FileInputStream fis=new FileInputStream(new File("./DataExcel/DataSheet.xls"));
		
		Workbook wb= WorkbookFactory.create(fis);
		
		Sheet sh=wb.getSheet("sheet11");
		Row row=sh.createRow(4);
		Cell ce=row.createCell(1);
		String value=ce.toString();
		
		FileOutputStream fout=new FileOutputStream("./DataExcel/DataSheet1.xls");
		wb.write(fout);
	}
}
