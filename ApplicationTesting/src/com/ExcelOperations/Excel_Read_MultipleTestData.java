package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_MultipleTestData {

	public static void main(String[] args) throws IOException {
	
		       // 1. identify the file on the system
		
				FileInputStream file = new FileInputStream("./src/com/ExcelTestDataFiles/MultipleTestData.xlsx");
				
				// 2. identify the workBook in the file
				
				XSSFWorkbook workBook = new XSSFWorkbook(file);
				
				// 3. identify the sheet in the workBook
				
				XSSFSheet sheet = workBook.getSheet("Sheet1");
				
		        // finding the number of active Rows
				
				int rowCount=sheet.getLastRowNum();
				
				for(int i=0;i<=rowCount;i++) // to go to all the active Rows
				{
					Row row=sheet.getRow(i); // will go to a Row
					
					// identifying the number of active Cells
					
					int cellCount=row.getLastCellNum();
					
					for(int j=0;j<cellCount;j++) // to go to every Active Row of all the cells
					{
						Cell cell=row.getCell(j);
						String data=cell.getStringCellValue();
					    System.out.print(data+" ");
					
					}
					System.out.println();
				}
					

	}

}
