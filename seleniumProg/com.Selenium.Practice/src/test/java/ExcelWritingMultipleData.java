

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelWritingMultipleData
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	/*FileInputStream fis = new FileInputStream(new File("./DataExcel/DataSheet1.xls"));
	Workbook wb=WorkbookFactory.create(fis);
	
	//Sheet sh=wb.getSheet("Sheet1");
	Sheet sh=wb.createSheet("Sheet1");
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.flipkart.com");
	List<WebElement> link = driver.findElements(By.xpath("//a"));
	
	for(int i=0;i<link.size();i++)
	{
		Row r = sh.createRow(i);

		Cell c = r.createCell(i);
		c.setCellValue(link.get(i).getAttribute("href"));
	
		}
	}
	FileOutputStream fout=new FileOutputStream("./DataExcel/DataSheet1.xls");
	sh.write(fout);*/
		
		
	File file=new File("./DataExcel/DataSheet1.xls");
	XSSFWorkbook wb=new XSSFWorkbook();
	XSSFSheet sh=wb.createSheet("Sheet1");
	
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.flipkart.com");
	List<WebElement> link = driver.findElements(By.xpath("//a"));
	
	for(int i=0;i<link.size();i++)
	{
		Row r = sh.createRow(i);
		Cell c = r.createCell(i);
		c.setCellValue(link.get(i).getAttribute("href"));
		}
	try
	{
		FileOutputStream fos=new FileOutputStream(file);
		wb.write(fos);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
    }

}
