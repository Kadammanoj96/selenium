package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel {
	
public static void main(String[] args) throws IOException   {
	FileInputStream fis = new FileInputStream("./excelfile/test data.xlsx");
	
	Workbook wb = WorkbookFactory.create(fis);
	int r1 = wb.getNumberOfSheets();
	/*
	 * System.out.println(r1); System.out.println(wb.getSheetIndex("Alltypedata"));
	 * System.out.println(wb.getSheetName(2));
	 */
	
   Sheet s1=wb.getSheet("Allstringdata");
   System.out.println(s1.getLastRowNum());
   System.out.println(s1.getPhysicalNumberOfRows());
 Row r2 = s1.getRow(1);
 
 System.out.println(r2.getLastCellNum());
 
 Cell c1 = r2.getCell(2);
 System.out.println(c1.getCellType());
}}