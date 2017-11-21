package com.tcs.claritasautomation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DriverScript  {
	String repository= "E:\\SampleProject_inputs\\";
	String file= repository+"LoginCredentials.xlsx";
	
	@SuppressWarnings("resource")
	@Test
	public void mainDriverScript() throws Exception{
		try {
		
			File fi= new File(file);
			FileInputStream fis= new FileInputStream(fi);
			XSSFWorkbook book= new XSSFWorkbook(fis);
			XSSFSheet sheet= book.getSheet("MainSheet");
			for(int rownum=1;rownum<sheet.getLastRowNum();rownum++){
				
				if(sheet.getRow(rownum).getCell(2)!=null)
				{
					if(sheet.getRow(rownum).getCell(2).getStringCellValue().equals("Yes"))
					{
						String ModuleSheet= sheet.getRow(rownum).getCell(1).getStringCellValue();
						XSSFSheet sheet1= book.getSheet(ModuleSheet);
						
						for(int rownum1=1;rownum1<sheet.getLastRowNum();rownum1++){
							
							
							
							if (sheet1.getRow(rownum1).getCell(2)!=null)
							{
								if(sheet1.getRow(rownum1).getCell(2).getStringCellValue().equals("Yes"))
								{
									switch(ModuleSheet)
									{
									case "FileEnhancement":
										
										ClaritasLogin login=new ClaritasLogin();
										login.FEFlow(); 
										break;
										
									case "InteractiveMap":
										
										break;
										
									case "StandardReports":
										break;
								}
							}
							
						}
						
					}
					
				}
			}
			
		} 
		}
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
