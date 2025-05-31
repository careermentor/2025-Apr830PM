package firstpkg;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	public static void readdata() throws Exception {

		File f = new File("C:\\TestData\\userdata.xlsx");

		FileInputStream fis = new FileInputStream(f);

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheet("Sheet2");

		int nr = sheet1.getPhysicalNumberOfRows();
		System.out.println(nr); // 3

		for (int i = 0; i < nr; i++) 
		{
			XSSFRow row = sheet1.getRow(i);

			int nc = row.getPhysicalNumberOfCells();

			for (int j = 0; j < nc; j++) 
			{

				XSSFCell col = row.getCell(j);
				
				if(col.getCellType() == CellType.STRING)
				{
					System.out.print(col.getStringCellValue() + "       ");
				}
				else if(col.getCellType() == CellType.NUMERIC)
				{
					System.out.print(col.getNumericCellValue() + "       ");
				}
				
				
			}
			
			System.out.println();

		}

		/*
		 * 
		 * //Row1 XSSFRow row1 = sheet1.getRow(0);
		 * 
		 * XSSFCell col1 = row1.getCell(0); System.out.print(col1.getStringCellValue() +
		 * "       ");
		 * 
		 * XSSFCell col2 = row1.getCell(1); System.out.print(col2.getStringCellValue() +
		 * "       ");
		 * 
		 * System.out.println();
		 * 
		 * //Row2 XSSFRow row2 = sheet1.getRow(1);
		 * 
		 * XSSFCell col21 = row2.getCell(0); System.out.print(col21.getStringCellValue()
		 * + "       ");
		 * 
		 * XSSFCell col22 = row2.getCell(1); System.out.print(col22.getStringCellValue()
		 * + "       ");
		 * 
		 * XSSFCell col23 = row2.getCell(2); System.out.print(col23.getStringCellValue()
		 * + "       ");
		 * 
		 */
	}

	public static void main(String[] args) throws Exception {
		readdata();
	}

}
