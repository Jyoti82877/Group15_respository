package excelreadandwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelSheet {
	
	@SuppressWarnings("resource")
	public static void writeData() throws IOException
	{
		
		File src=new File("C:\\Users\\jyoti\\OneDrive\\Desktop\\ExcelReadtest.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sht=wb.getSheet("Sheettest");
		
		File fout=new File("C:\\Users\\jyoti\\OneDrive\\Desktop\\ExcelReadtest.xlsx");
		FileOutputStream fos=new FileOutputStream(fout);
		sht.getRow(18).createCell(3).setCellValue("Write numbers");
		
		sht.getRow(40).getCell(3).setCellValue("Gangtok");
	
		wb.write(fos);
		
		
	}
	
}
	 
	
	