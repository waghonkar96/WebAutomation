package utils;

public class ExcelUtilsDemo {

    public static void main(String[] args) {

        String projectpath = System.getProperty("user.dir");
        ExcelUtils excel = new ExcelUtils(projectpath + "/Excel/Data.xlsx", "Sheet1");

        excel.getRowCount();
        excel.getCellData(0, 0);
        excel.getCellDataNumber(1, 1);
    }
}
