package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelIntegration {

	public static String[][] readExcel(String excelFileName) throws IOException {
		XSSFWorkbook wb= new XSSFWorkbook("./data/"+excelFileName+".xlsx");
		//get sheet
		XSSFSheet sheetAt = wb.getSheetAt(0);
		//get row
		XSSFRow row = sheetAt.getRow(1);
		//get cell
		XSSFCell cell = row.getCell(1);
		//to retrieve one value
//		String oValue = cell.getStringCellValue();
//		System.out.println(oValue);
				//to find row count
		int rowCnt = sheetAt.getLastRowNum();
		System.out.println("Row count:"+rowCnt);
		
		//to find column count
		short colCnt = sheetAt.getRow(0).getLastCellNum();
		System.out.println("Column count:"+colCnt);
		
		String[][] data= new String[rowCnt][colCnt];
		//retrieve all values
		for (int i = 1; i <= rowCnt; i++) {
			XSSFRow row2 = sheetAt.getRow(i);
				for (int j = 0; j < colCnt; j++) {
					XSSFCell cell2 = row2.getCell(j);
					String cellData = cell2.getStringCellValue();
//					System.out.println(cellData);
					data[i-1][j]=cellData;
				}
		}
		wb.close();
		return data;
	}

}
