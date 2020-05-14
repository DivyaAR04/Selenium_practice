package com.Selenium.Programs;

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

public class ExcelSheet1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	// TODO Auto-generated method stub
	// to create file(using File) reference and to read data from file(using FileInputStream)	
	FileInputStream fin = new FileInputStream(new File("./DataExcel/DataSheet.xls"));
	// to read data we will take the help of workbook factory
	Workbook wb = WorkbookFactory.create(fin);
	//accessing sheet
	Sheet sh=wb.getSheet("Sheet1");
	//Accessing 1st row
	Row rc=sh.getRow(1);
	//get the cell value
	Cell ce=rc.getCell(1);
	// to get/read the data
	String data= ce.toString();
	String data1=ce.getStringCellValue();
	System.out.println(data1);
	}

}
