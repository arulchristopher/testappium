package com.ltng01.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelInteraction {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub

	HSSFWorkbook wb = new HSSFWorkbook(new FileInputStream(new File("/home/linux/EMI_Data1.xls")));
		
	HSSFSheet sheet = wb.getSheet("Sheet1");
	
	System.out.println(sheet.getLastRowNum());

	}

}
