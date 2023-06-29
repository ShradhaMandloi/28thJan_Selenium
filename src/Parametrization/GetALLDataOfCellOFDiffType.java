package Parametrization;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetALLDataOfCellOFDiffType {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream file= new FileInputStream("C:\\Users\\DC\\Desktop\\screenshot\\PARAMETERIZATION_EXCEL.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet2");
		
		int lastrowindex= sh.getLastRowNum();
		for(int i=0;i<=lastrowindex;i++) {
			Cell cellinfo=sh.getRow(i).getCell(0);
			CellType c1=cellinfo.getCellType();
			
			if(c1==CellType.STRING) {
				String value=cellinfo.getStringCellValue();
				System.out.println(value);
			}
			if(c1==CellType.NUMERIC) {
				double value=cellinfo.getNumericCellValue();
				System.out.println(value);
			}
			if(c1==CellType.BOOLEAN) {
				boolean value=cellinfo.getBooleanCellValue();
				System.out.println(value);
			}

		}

	}

}
