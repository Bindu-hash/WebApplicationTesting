package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_WriteOperation {

	public static void main(String[] args) throws IOException {
		
        // 1. identify the file on the system
		
		FileInputStream file = new FileInputStream("./src/com/ExcelTestDataFiles/SingleTestData.xlsx");
		
		// 2. identify the workBook in the file
		
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		
		// 3. identify the sheet in the workBook
		
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
        // 4. create a row in the sheet
		
		Row row=sheet.createRow(2);
		
		// 5. create a Row of a cell
		
		Cell cell=row.createCell(3);
		
		cell.setCellValue("Selenium");
		
		cell.setCellValue("LoadRunner");
		
		Cell cell5=row.createCell(5);
		cell.setCellValue("Jmeter");
		
		// Save the WorkBook in which the Write operations are done
		
		FileOutputStream file1=new FileOutputStream("./src/com/ExcelTestDataFiles/SingleTestData.xlsx");
		workBook.write(file1);
		
		
			
		
		
	}

}
