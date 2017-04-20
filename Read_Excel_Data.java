package videos;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel_Data {

	public static void main(String[] args) throws Exception {

		File src = null;
		FileInputStream fir = null;
		XSSFWorkbook wb = null;
		XSSFSheet sheet = null;
		String value = null;

		// creating the file and taking the excel sheet into it
		src = new File("D:\\javaPrograms\\Selinium\\Selenium_first\\ExcelSheets\\TestSheet.xlsx");

		// placing the src file into the FileInputStream
		fir = new FileInputStream(src);

		// creating the workbook
		wb = new XSSFWorkbook(fir);

		// gathering the sheet data
		sheet = wb.getSheetAt(0);

		// gathering the rows and column values
		value = sheet.getRow(0).getCell(1).getStringCellValue();

		// displaying the cell value
		System.out.println(value);

		// closing the Workbook
		wb.close();

	}

}
