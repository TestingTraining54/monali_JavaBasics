package day12;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReading {
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;

	public ExcelReading(String filePath, String sheetName) throws IOException {
		fis = new FileInputStream(filePath);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheet(sheetName);
	}

	public int noOfRows() {
		return sheet.getPhysicalNumberOfRows();

	}

	public int noOfCols() {
		return sheet.getRow(0).getPhysicalNumberOfCells();
	}

	public void getData() {
		for (int row = 0; row < noOfRows(); row++) {// 3

			for (int col = 0; col < noOfCols(); col++) {// 3<3
				System.out.print(sheet.getRow(row).getCell(col).getStringCellValue() + " ");
			}

			System.out.println();

		}
	}

	

}
