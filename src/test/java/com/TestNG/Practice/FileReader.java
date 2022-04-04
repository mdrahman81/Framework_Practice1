package com.TestNG.Practice;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.streaming.SXSSFRow.CellIterator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class FileReader {
	
	
//	public void excelGenerator() throws IOException {
	
	public static void main(String[] args) throws IOException {
		
		/*File os = new File("/Users/mdrahman/eclipse-workspace/Framework_Practice1/Files/TestFiles/data.xlsx");
		os.createNewFile();*/
		ArrayList<Object> li = new ArrayList<Object>();
		
		FileInputStream fis = new FileInputStream("/Users/mdrahman/eclipse-workspace/Framework_Practice1/Files/TestFiles/TestData.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheetAt(0);
		
		Iterator <Row> iterator = sheet.iterator();
		
		while (iterator.hasNext()) {
		Row row = iterator.next();	
			
			int rowNumber = row.getRowNum();
			
			if(rowNumber != 0) {
			
			Iterator<Cell> cellIterator = row.cellIterator();
			while (cellIterator.hasNext()) {
				
				
				Cell cell = cellIterator.next();
			
				switch (cell.getCellType()) {
				
				case STRING:
					
					System.out.print(cell.getStringCellValue()+ " ");
					li.add(cell.getStringCellValue());
					break;
					
				case NUMERIC:
					System.out.print(cell.getNumericCellValue()+ " ");
					li.add(cell.getStringCellValue());
					break;	
				
			}
				
			
				
			}
			System.out.println();
			}
		}
		System.out.println(li);
		fis.close();
	
		
		
		
	}

	
	
}
