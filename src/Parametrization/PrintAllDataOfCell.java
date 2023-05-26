package Parametrization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintAllDataOfCell {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		FileInputStream file= new FileInputStream("C:\\Users\\DC\\Desktop\\screenshot\\PARAMETERIZATION_EXCEL.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet3");
		
		int lastrowindex=sh.getLastRowNum();
		for(int i=0; i<=lastrowindex; i++) {
			String value=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println(value+" ");
	}

	}
}
