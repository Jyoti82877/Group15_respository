package excelreadandwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	public static void main(String[] args) throws IOException {
		
		
		File fs=new File("C:\\Users\\jyoti\\OneDrive\\Desktop\\ExcelReadtest.xlsx");
		
		FileInputStream fs1=new FileInputStream(fs);
		
		XSSFWorkbook bk=new XSSFWorkbook(fs1);
		
		XSSFSheet Sht=bk.getSheet("Sheettest");
		
		String value = Sht.getRow(5).getCell(1).getStringCellValue();
		
		System.out.println(value);
		
		DataFormatter df=new DataFormatter();
		
	String numericstringvalue = df.formatCellValue(Sht.getRow(20).getCell(1));
	
		System.out.println(numericstringvalue);
				
	}
}
