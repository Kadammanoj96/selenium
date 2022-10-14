package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel2 {
	public static void main(String[] args) throws IOException    {
		
		
		FileInputStream fis = new FileInputStream("./excelfile/test data.xlsx");

		Workbook wb = WorkbookFactory.create(fis);
		Sheet s1 = wb.getSheet("WriteEx");
		s1.getRow(1).createCell(3).setCellValue("manoj");
		
		s1.getRow(2).createCell(3).setCellValue("what's up only");
		s1.getRow(3).createCell(3).setCellValue(false);
		FileOutputStream fos = new FileOutputStream("./excelfile/test data.xlsx");
		wb.write(fos);
		fos.close();
		}
	
	}
