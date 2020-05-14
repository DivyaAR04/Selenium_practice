// Program to display the values in excell sheet

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelMultipleData 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	//create object of FileInputStream, by passing the path of the excel file 	
	FileInputStream fin=new	FileInputStream(new File("./DataExcel/DataSheet.xls"));
	
	//create the instancce of the workbookfactory by passing the argument  
	Workbook wb=WorkbookFactory.create(fin);
	
	//creating instance of sheet, by passing the Sheet name as parameter
	Sheet sh=wb.getSheet("Sheet1");
	
	// finding the number of rows in table
	int rc=sh.getLastRowNum();
	System.out.println("the number of rows in the sheet" +rc);
		
	for(int i=0;i<=rc;i++)
	{
		Row row=sh.getRow(i);
	    //to get the number of cells in each row	
		short cc=row.getLastCellNum();
		for(int j=0;j<cc;j++)
		{
			Cell cell=row.getCell(j);
			String val=cell.toString();
			System.out.print("\t"+val);
		}
		System.out.println();
	}
	
	}
}
