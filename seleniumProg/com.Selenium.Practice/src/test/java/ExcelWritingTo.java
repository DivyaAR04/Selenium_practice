

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

// program to copy the content of one excel file to another excel file
public class ExcelWritingTo 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream(new File("./DataExcel/DataSheet.xls"));
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
		Row ro=sh.getRow(0);
		Cell ce=ro.getCell(0);
		
		FileOutputStream fis1=new FileOutputStream(new File("./DataExcel/DataSheet1.xls"));
		wb.write(fis1);
	}

}
