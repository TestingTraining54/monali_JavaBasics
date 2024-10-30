package day12;

import java.io.IOException;

public class MonaliMain {

	public static void main(String[] args) throws IOException {
		ExcelReading excel = new ExcelReading("C:\\Users\\91733\\OneDrive\\Desktop\\data.xlsx", "login");
		excel.getData();

	}

}
