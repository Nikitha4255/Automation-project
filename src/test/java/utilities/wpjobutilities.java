package utilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class wpjobutilities {
	public static String getcellvalue (String xlpath,String sheet,int r,int c) {
		try {
			FileInputStream f=new FileInputStream(xlpath);
			XSSFWorkbook wb = new 	XSSFWorkbook(f);
			XSSFCell sh = wb.getSheet("sheet1").getRow(r).getCell(c);
			if(sh.getCellType()==CellType.STRING) {
				return sh.getStringCellValue();
			}
			else {
				return sh.getRawValue();
			}
		}
		catch(Exception e) {
			return"";
		}
		
		
	}

	public static int getRowcount(String xlpath, String sheet) {
		try {
			FileInputStream f=new FileInputStream(xlpath);
			XSSFWorkbook wb = new 	XSSFWorkbook(f);
			return wb.getSheet(sheet).getLastRowNum();
		
	}
	catch(Exception e) {
		return 0;
	}
		
	}

	
}
