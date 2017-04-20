package videos;

import Utility.Excel_data_config;

public class Excel_Sheet_Data_using_library {
	
	static Excel_data_config data=null;
	
	public static void main(String[] args) {
		
		//creating the object for the library class
		data=new Excel_data_config("D:\\javaPrograms\\Selinium\\Selenium_first\\ExcelSheets\\TestSheet.xlsx");
		
		//displaying the cell value
		System.out.println(data.excel_data(0,0,0));
		
	}

}
