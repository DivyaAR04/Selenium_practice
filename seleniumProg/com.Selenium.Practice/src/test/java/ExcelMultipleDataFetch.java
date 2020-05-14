// program to display details of excell sheet

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

public class ExcelMultipleDataFetch 
{
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream(new File("./DataExcel/DataSheet.xls"));
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
		
		int rc=sh.getLastRowNum();
		for(int i=0;i<=rc;i++)
		{
			Row row=sh.getRow(i);
			short cc=row.getLastCellNum();
			for(int j=0;j<=cc;j++)
			{
				Cell cell=row.getCell(j);
				String val=cell.getStringCellValue();
				System.out.println(val);
			}
			System.out.println();
		}
	}

}
