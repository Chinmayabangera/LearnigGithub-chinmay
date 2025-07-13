package com.Utility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	public static String getTestData(int rowNumber, int cellNumber) throws InvalidFormatException, IOException  {

		// Create File class object.
		
		File file = new File("C:\\Users\\Admin\\Desktop\\TestData.xlsx");

		// Create Workbook object.
		
		XSSFWorkbook book = new XSSFWorkbook(file);

		// Create Sheet object.
		
	Sheet sheet = 	book.getSheetAt(0);
		

		// specify the row and cell number.
	
		return sheet.getRow(rowNumber).getCell(cellNumber).getStringCellValue();
	
	
	}
}

	