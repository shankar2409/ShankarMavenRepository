package javasele;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excell {
	public static void main(String[] args) throws Exception, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Desktop\\testcase fireflink.xlsx");
		Workbook wk = WorkbookFactory.create(fis);
		String result = wk.getSheet("Sheet1").getRow(5).getCell(0).getStringCellValue();
		System.out.println(result);

	}
}
