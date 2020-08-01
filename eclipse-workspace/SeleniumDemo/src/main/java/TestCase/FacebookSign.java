package TestCase;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookSign {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver =null ;
		/*****Open Browser and Navigate to url ********/
		
		driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		
		/*************  How to Read Data From Excel   ****************************/
		
		File src = new File("src/main/resources/testdata/TestData1.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb =new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		String data1= sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Value of First Coulmn :"+data1);
//		       
		/********   How to write data in excel  *******************************/
		
		
//		sheet1.getRow(0).createCell(5).setCellValue("pass");
//		FileOutputStream fout =new FileOutputStream(src);
//		wb.write(fout);
//		System.out.println("Data craetion sucessfull");
//		
		
		
		driver.close();
	driver.quit();
//		
		
		
		

	}

}
