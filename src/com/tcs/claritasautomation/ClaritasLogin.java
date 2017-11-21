package com.tcs.claritasautomation;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class ClaritasLogin extends DriverScript {
	Row rownumber;
	String TestCaseId;
	String TestCase; 
	String Browser;
	String UserID;
	String Pwd;
	
	public void loginToClaritas(Sheet sheet1,int row){
		
		rownumber= sheet1.getRow(row);
		getParameters();
	}

	public void getParameters(){
	
		TestCaseId = rownumber.getCell(0).getStringCellValue();
		TestCase = rownumber.getCell(1).getStringCellValue();
		Browser= rownumber.getCell(4).getStringCellValue();
		UserID = rownumber.getCell(5).getStringCellValue();
		Pwd = rownumber.getCell(6).getStringCellValue();
	}
	
	public void FEFlow(){
		
		CommonFunctions common= new CommonFunctions();
		common.browserSelection(Browser, UserID, Pwd);
	}

}
