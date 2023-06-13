package Parametrization;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.WorkbookFactory;



public class GetstringData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		FileInputStream file= new FileInputStream("C:\\Users\\DC\\Desktop\\screenshot\\PARAMETERIZATION_EXCEL.xlsx");
		
		String value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);
		
//		Workbook book= WorkbookFactory.create(file);
//		Sheet sh= book.getSheet("Sheet1");
//		Row rw=sh.getRow(0);
//		Cell cl= rw.getCell(0);
//		String Value=cl.getStringCellValue();
//		System.out.println(value);
	}

}

