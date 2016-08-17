package com.ltng01.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.testng.annotations.DataProvider;

public class DataProvider_Test {

	
	@DataProvider(name="dp_test")
	public static Iterator<String[]> mydat() throws IOException{
		
		ExcelReadWrite wb = new ExcelReadWrite("/home/linux/EMI_Data1.xls");
		
		HSSFSheet sheet = wb.Setsheet("Sheet1");
		
		int rowcount = wb.getrowcount(sheet);
		List<String[]> data=new ArrayList<String[]>();
		
		for (int i=1;i<=rowcount;i++){
			String[] rowdata=new String[3];
			
			rowdata[0]=wb.Readvalue(sheet, i, "Amount");
			rowdata[1]=wb.Readvalue(sheet, i, "Interest");
			rowdata[2]=wb.Readvalue(sheet, i, "Tenure");
           
			data.add(rowdata);	

		}
		
		return data.iterator();
	}
	
}
