package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel_Read_SingleTestData {

	public static void main(String[] args) throws IOException {
		
		// 1. identify the file on the system
		
		FileInputStream file = new FileInputStream("./src/com/ExcelTestDataFiles/SingleTestData.xlsx");
		
		// 2. identify the workBook in the file
		
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		
		// 3. identify the sheet in the workBook
		
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		// 4. identify the Row in the sheet
		
		Row row=sheet.getRow(0);
		
		// 5. identify the Row of a cell
				
		Cell cell=row.getCell(0);
		
		// 6. get the data from the Row of a cell
		
		String data=cell.getStringCellValue();
		
		System.out.println(data);
		
		
		
		
		
		
	}

}
