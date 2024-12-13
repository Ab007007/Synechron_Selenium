package com.synechron.selenium.basics.utils;

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {
    public static Workbook workbook = null;
    public static Sheet sheet = null;
    public static Row row = null;
    public static Cell cell = null;



    public static Workbook getWorkbook() {
        try {
            String fileName = ConfigReader.getConfigValue("testdata");
            workbook = WorkbookFactory.create(new FileInputStream(new File(fileName)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return workbook;
    }

    public static Sheet getSheet(String sheetName) {
        workbook = getWorkbook();
        sheet = workbook.getSheet(sheetName);
        return sheet;
    }

    public static  Row getRow(String sheetName, int rowNum) {
        workbook = getWorkbook();
        sheet = workbook.getSheet(sheetName);
        row = sheet.getRow(rowNum);
        return row;
    }

    public static int getRowCount(String sheetName) {
        workbook = getWorkbook();
        sheet = workbook.getSheet(sheetName);
        return sheet.getLastRowNum()+1;
    }

    public static int getColumnCount(String sheetName, Row row) {
        workbook = getWorkbook();
        sheet = workbook.getSheet(sheetName);
        row = sheet.getRow(row.getRowNum());
        return row.getLastCellNum();
    }

    public static Cell getCell(String sheetName, int rowNum, int colNum) {
        workbook = getWorkbook();
        sheet = workbook.getSheet(sheetName);
        row = sheet.getRow(rowNum);
         cell = row.getCell(colNum);
        return cell;
    }

    public static String getCellValue(Cell cell) {
        System.out.println("Cell type " + cell.getCellType());
        return cell.getStringCellValue();
    }

    public static void main(String[] args) throws IOException {

        Workbook wb = null;
        wb = WorkbookFactory.create(new FileInputStream(new File("./src/data/testdata.xls")));
        Sheet sheet = wb.getSheet("Sheet1");
        int  rowCount = sheet.getLastRowNum();
        System.out.println("Row count: " + (rowCount+1));
        Row row = null;
        int columnCount=0;
        Cell cell = null;
        for (int i = 0; i < rowCount+1 ; i++)
        {
            row = sheet.getRow(i);
           columnCount = row.getLastCellNum();
            for (int j = 0; j < columnCount; j++)
            {
                System.out.print(row.getCell(j).toString() + " - " + row.getCell(j).getCellType() + " | ");
            }
            System.out.println();
        }

        /* int sheetCount = wb.getNumberOfSheets();
        System.out.println("Total sheet count: " + sheetCount);
        for (int i = 0; i < sheetCount; i++) {
            System.out.println(wb.getSheetName(i));

        }*/

    }
}
