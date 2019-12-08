package flipWrapper;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DP 
{

	public String[][] getData(getSheetName)
	{
		String[][] testData;
		FileInputStream FIS = new FileInputStream("./TestData/Saran.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(FIS);
		XSSFSheet sh =wb.getSheetAt(0);
		int row = sh.getLastRowNum();
		int c =sh.getRow(0).getLastCellNum();
		for(i=1;i<=row;i++)
		{
			for(j=0;j<c;j++)
			{
				String celldata = sh.getRow(i).getCell(j).getStringCellValue();
				testData[i-1][j]=celldata;
				
			}
		}
		return testData;	
	}
}
