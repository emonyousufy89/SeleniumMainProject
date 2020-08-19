package DDDTestWithExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/*
 * EXCEL SHEET > WORK BOOK > SHEET > ROW > CELL
 * 
 * FileInputStream to Read the file
 * FileOutputStream to Write the file
 * XSSFWorkbook
 * XSSFSheet
 * XSSFRow
 * XSSFCell
 */
public class ExcelAutomationOne {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream("/Users/mdsalahuddin/Documents/WorkbookTEST.xlsx"); // find the path of the wordbook
		XSSFWorkbook book = new XSSFWorkbook(file);
		//XSSFSheet sheet = book.getSheet("Sheet1"); //by name sheet
		XSSFSheet sheet1 = book.getSheetAt(0); // by index sheet

		int rowcount = sheet1.getLastRowNum();  // Return Row count
		int cellcount = sheet1.getRow(1).getLastCellNum();  // Returns cell Count
		
		for(int i=0; i<rowcount; i++) {  // focus on the current row 
			XSSFRow RowRead = sheet1.getRow(i); // Read the Row value
			for(int j=0; j<cellcount; j++) {  // focus on the cell value
			String value =	RowRead.getCell(j).toString(); // toString is generic data type
			// .getStringCellValue()  string typ data
			//..getNumericCellValue() Number type data
			//.getBooleanCellValue() BooleanType data
			System.out.print("  " + value); // print the value
		}
		System.out.println(); // print the next line
	}
	}
}
