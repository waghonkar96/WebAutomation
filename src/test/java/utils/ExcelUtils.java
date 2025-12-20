package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.ss.usermodel.DataFormatter;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

    XSSFWorkbook workbook;
    XSSFSheet sheet;

    // Constructor
    public ExcelUtils(String excelPath, String sheetName) {
        try {
            workbook = new XSSFWorkbook(excelPath);
            sheet = workbook.getSheet(sheetName);

            if (sheet == null) {
                throw new RuntimeException("Sheet not found: " + sheetName);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getRowCount() {
  
        int rowCount = sheet.getPhysicalNumberOfRows();
        //System.out.println("Row count is: " + rowCount);
        return rowCount;
    }

    public String getCellData(int rowNum, int colNum) {

        DataFormatter formatter = new DataFormatter();
        String data = formatter.formatCellValue(sheet.getRow(rowNum).getCell(colNum));
        return data;
    }


    public void getCellDataNumber(int rowNum, int colNum) {
        double data = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
        //System.out.println(data);
        
    }
    
    public int getColCount() {
        int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
        //System.out.println("No of Columns is: " + colCount);
        return colCount;
    }
}
