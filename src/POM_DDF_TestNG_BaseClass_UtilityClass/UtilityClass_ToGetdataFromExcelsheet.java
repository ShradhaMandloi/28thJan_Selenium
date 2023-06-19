package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass_ToGetdataFromExcelsheet {
	
	//@Authorname=shradha mandloi
	//this method is used to get data form excel sheet 
	//need to pass two inputs
	public static String getTestData(int rowindex, int colindex) throws EncryptedDocumentException, IOException {
		
		FileInputStream file= new FileInputStream("C:\\Users\\DC\\Desktop\\exceldata\\DDF data.xlsx");
		Sheet sh= WorkbookFactory.create(file).getSheet("DDF");
		
		String value=sh.getRow(rowindex).getCell(colindex).getStringCellValue();
		return value;
	}
	
}
