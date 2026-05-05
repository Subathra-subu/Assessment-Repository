package com.Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;




public class Input {
	
	
	@DataProvider(name="validData")
	public Object[][] getvalidRegExcelData() throws IOException{
		String arrObj[][] = getData("src/test/resources/InputFile.xlsx","sheet1");
		return arrObj;
	}
	
	@DataProvider(name="InvalidData")
	public Object[][] getInvalidRegExcelData() throws IOException{
		String arrObj[][] = getData("src/test/resources/InputFile.xlsx","sheet2");
		return arrObj;
	}
	
	@DataProvider(name="validLoginData")
	public Object[][] getvalidLogExcelData() throws IOException{
		String arrObj[][] = getData("src/test/resources/InputFile.xlsx","sheet3");
		return arrObj;
	}
	

	@DataProvider(name="InValidLoginData")
	public Object[][] getInvalidLogExcelData() throws IOException{
		String arrObj[][] = getData("src/test/resources/InputFile.xlsx","sheet4");
		return arrObj;
	}
	
	public String[][] getData(String fileName,String sheetName){
		String[][] data = null;
		
		try {
		FileInputStream fis = new FileInputStream(fileName);
		XSSFWorkbook workBook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workBook.getSheet(sheetName);
		XSSFRow row = sheet.getRow(0);
		int noOfRows = sheet.getPhysicalNumberOfRows();
		int noOfCol = row.getLastCellNum();
		
		Cell cell;
		
		data = new String[noOfRows-1][noOfCol];
		
		for(int i=1;i<noOfRows;i++) {
			for(int j=0;j<noOfCol;j++) {
				row = sheet.getRow(i);
				cell = row.getCell(j);
				DataFormatter format = new DataFormatter();
				data[i-1][j]=format.formatCellValue(cell);
			}
		}
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
		
		return data;
	}

}
