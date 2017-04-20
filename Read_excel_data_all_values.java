package videos;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_excel_data_all_values {

	public static void main(String[] args) throws Exception {

		File src = null;
		FileInputStream fir = null;
		XSSFWorkbook wb = null;
		XSSFSheet sheet = null;
		int size, i = 0;
		String value = null;

		// creating the file and taking the excel sheet into it
		src = new File("D:\\javaPrograms\\Selinium\\Selenium_first\\ExcelSheets\\TestSheet.xlsx");

		// placing the src file into the FileInputStream
		fir = new FileInputStream(src);

		// creating the workbook
		wb = new XSSFWorkbook(fir);

		// gathering the sheet data
		sheet = wb.getSheetAt(0);

		// caliculating the size of the row
		size = sheet.getLastRowNum();

		// processing the sheet for the row values
		for (i = 0; i < size; i++) {

			// getting the string value of the cell into a string
			value = sheet.getRow(i).getCell(0).getStringCellValue();

			// displaying the string value
			System.out.println("The value in the cell is " + value);

		}

		// closing the workbook
		wb.close();

	}

}
