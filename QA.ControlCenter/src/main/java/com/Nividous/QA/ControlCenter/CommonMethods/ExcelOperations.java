package com.Nividous.QA.ControlCenter.CommonMethods;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import testBase.ReadConfigFile;

public class ExcelOperations {

	String Filepath;
	Sheet sh;
	public ExcelOperations(String SheetName) {
		Filepath = System.getProperty("user.dir")+ReadConfigFile.getSingletonConfigDetails().getPropertiesValue("testDataLocation");
		File TestDataFile = new File(Filepath);
		Workbook wb = null;
		try {
			wb = WorkbookFactory.create(TestDataFile);
			sh = wb.getSheet(SheetName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//get row data in hashmap format
	public HashMap<String,String> getTestDataInMap(int rownNum){
		
		//sh.getRow(0).getCell(0);
		HashMap<String , String> hm = new HashMap<String , String>();
		
		for(int i=0;i<sh.getRow(0).getLastCellNum();i++) {
			sh.getRow(rownNum).getCell(i).setCellType(CellType.STRING);
			hm.put(sh.getRow(0).getCell(i).toString(),sh.getRow(rownNum).getCell(i).toString());
		}
		return hm;
	}
	

	
	public int getRowCount() {
		return sh.getLastRowNum();
	}
	
	public int getColCount() {
		return sh.getRow(0).getLastCellNum();
	}
	
	public static void main(String[] args) {
		ExcelOperations e = new ExcelOperations("SmokeTestSuite");
		HashMap<String , String> hme = e.getTestDataInMap(1);
		System.out.println(hme);
	}
}

