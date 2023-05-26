package Parametrization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetALLDataOfRowOFDiffType {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream file= new FileInputStream("C:\\Users\\DC\\Desktop\\screenshot\\PARAMETERIZATION_EXCEL.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet2");
		
		int lastcellindex= sh.getRow(0).getLastCellNum()-1;
		for(int i=0;i<=lastcellindex;i++) {
			Cell cellinfo=sh.getRow(0).getCell(i);
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
