package fileRead;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class file {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Desktop\\Book1.xlsx");
		Workbook wk = WorkbookFactory.create(fis);
		
		int rowValue=wk.getSheet("Sheet1").getPhysicalNumberOfRows();
		System.out.println("row size"+rowValue);
		String result = null;
		try {
			for (int i = 0; i < rowValue; i++) {
				int celvalue = wk.getSheet("Sheet1").getRow(i).getPhysicalNumberOfCells();
				for (int j = 0; j <celvalue; j++) {
					try {
						
							result = wk.getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
							System.out.print(result+"  ");
						
						
					} catch (Exception e) {
						System.out.println("Null");
						
						continue;
					}

				}
				System.out.println();
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
