package com.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataSupplier {

	public static void main(String[] args) throws Exception {
		
		//creating instance for excel file, where we will provide the path
		File excelFile = new File("./src/main/resources/TestData.xlsx");
		System.out.println(excelFile.exists());
		//Creating input stream for excel file to read data
		
		FileInputStream fis = new FileInputStream(excelFile);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet Sheet = workbook.getSheet("Sheet1");
		int noOfRows = Sheet.getPhysicalNumberOfRows();
		
		System.out.println(noOfRows);

	}

}
