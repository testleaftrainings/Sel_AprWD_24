package week4.day4;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
public  String[][] readData() throws IOException {
	
	//to set the file path
	XSSFWorkbook book=new XSSFWorkbook("./data/CreateLead2.xlsx");
	//get the sheet name
	XSSFSheet sheet = book.getSheet("Sheet1");
	//row count
	int rowCount = sheet.getLastRowNum();
	System.out.println("row "+rowCount);  //3  index 3 --> 0,1,2
	
	//To get the column Count
	int columnCount = sheet.getRow(0).getLastCellNum();
	System.out.println(columnCount);
	//print the values from excel sheet 
	                //i<5 3
	String[][] data=new String[rowCount][columnCount];
	for (int i = 1; i <=rowCount; i++) {
		for (int j = 0; j < columnCount; j++) {
			                                // 1    0
			String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
			System.out.println(stringCellValue);
			//here --> 1,0  //1-1 --0,0
			data[i-1][j]=stringCellValue;
		}
		
	}
	
	
	//close the work book
	book.close();
	
	return data;
}
}
//int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
	//System.out.println("physicalNumberOfRows"+physicalNumberOfRows);