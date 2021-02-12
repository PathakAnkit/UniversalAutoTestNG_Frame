package org.application.genericUtil;


import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel_Editor 
{
	private static XSSFWorkbook ExcelWBook; 
	private static XSSFSheet ExcelWSheet;
	private static XSSFCell Cell;
	
	public static int getRowCount(String filename, String sheetName) {
		
		String strfile=(System.getProperty("user.dir") + "\\src\\test\\resources\\DataExcel\\"+filename);
		int r =0;
		try {
			r=WorkbookFactory.create(new FileInputStream(strfile)).getSheet(sheetName).getLastRowNum();
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
		return r;
		
	}
	
	public static String getCellValue(String filename, String sheetName, int r, int c) {

		String CellData="";
		String strfile=(System.getProperty("user.dir") + "\\src\\test\\resources\\DataExcel\\"+filename);
		try {
			
			FileInputStream ExcelFile= new FileInputStream(strfile);
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(sheetName);
			Cell = ExcelWSheet.getRow(r).getCell(c);
			CellData = Cell.getStringCellValue();
		}catch(Exception ae) {
			System.err.println(ae.getMessage());
		}		
		return CellData;
	}
	
	
	
	
	//end of class
}

