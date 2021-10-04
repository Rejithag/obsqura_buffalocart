package com.buffalocart.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static FileInputStream f;

	public ExcelUtility(String path, String sheet) throws IOException {
		f = new FileInputStream(path);
		wb = new XSSFWorkbook(f);
		ws = wb.getSheet(sheet);

	}

	public static String getString(int i, int j) throws IOException {
		Row r = ws.getRow(i);
		Cell c = r.getCell(j);
		return c.getStringCellValue();

	}

	public static String getNumeric(int i, int j) throws IOException {
		Row r = ws.getRow(i);
		Cell c = r.getCell(j);
		int value = (int) c.getNumericCellValue();
		return String.valueOf(value);

	}
}
