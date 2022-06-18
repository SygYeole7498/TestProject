package Pack1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		String path = "C:\\Users\\SUYOG YEOLE\\OneDrive\\Desktop\\12Feb.xlsx";

		FileInputStream file = new FileInputStream(path);

		/*
		 * String data =
		 * WorkbookFactory.create(file).getSheet("Velocity").getRow(0).getCell(0).
		 * getStringCellValue(); System.out.println(data);
		 */
		/*
		 * double data =
		 * WorkbookFactory.create(file).getSheet("Velocity").getRow(1).getCell(0).
		 * getNumericCellValue(); System.out.println(data);
		 */

		/*
		 * boolean data =
		 * WorkbookFactory.create(file).getSheet("Velocity").getRow(1).getCell(1).
		 * getBooleanCellValue(); System.out.println(data);
		 */

		Workbook workbook = WorkbookFactory.create(file);
		Sheet sheet = workbook.getSheet("Velocity");

		int rowcount = sheet.getLastRowNum(); // count-1

		for (int i = 0; i <= rowcount; i++) {
			int cellcount = sheet.getRow(i).getLastCellNum();
			for (int j = 0; j <= cellcount - 1; j++) {
				Cell cell = sheet.getRow(i).getCell(j);
				if (cell.equals(CellType.BOOLEAN)) {
					boolean cellValue = cell.getBooleanCellValue();
					System.out.print(cellValue + " |");
				} else if (cell.equals(CellType.STRING)) {
					String cellValue = cell.getStringCellValue();
					System.out.print(cellValue + " |");
				} else if (cell.equals(CellType.NUMERIC)) {
					double cellValue = cell.getNumericCellValue();
					System.out.print(cellValue + " |");
				}

			}
		}

	}
}
