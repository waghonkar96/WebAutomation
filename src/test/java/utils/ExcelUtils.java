package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
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

    public void getRowCount() {
        int rowCount = sheet.getPhysicalNumberOfRows();
        System.out.println("Row count is: " + rowCount);
    }

    public void getCellDataString(int rowNum, int colNum) {
        String data = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
        System.out.println(data);
    }

    public void getCellDataNumber(int rowNum, int colNum) {
        double data = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
        System.out.println(data);
    }
}
