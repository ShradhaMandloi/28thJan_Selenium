package Parametrization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintAllDataOfRow {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		FileInputStream file= new FileInputStream("C:\\Users\\DC\\Desktop\\screenshot\\PARAMETERIZATION_EXCEL.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet3");
		
		int lastcellindex=sh.getRow(0).getLastCellNum();
		System.out.println(lastcellindex);
		
		for(int i=0; i<=lastcellindex; i++) {
			String value=sh.getRow(0).getCell(i).getStringCellValue();
			System.out.print(value+" ");
		}
		
		
	}

}
