package com.app.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Adactin_BaseClass {
	public static WebDriver driver = null;
	
	public static void browserlaunch() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	public static void url(String url) {
		driver.get(url);
	}
	
	public static String excelReadDataReuseable(int a , int b) {
		String value =null;
		try {
			// location
			File f = new File("D:\\Benazir\\Programs\\Sample_Maven\\src\\test\\resources\\TestData\\Test_Sample.xlsx");	
			// read -> FileInput
			FileInputStream fis = new FileInputStream(f);
			// work book 
			Workbook wb = new XSSFWorkbook(fis);
			// sheet
			Sheet sheet = wb.getSheet("Sheet1");
			//row
			Row row = sheet.getRow(a);
			Cell cell = row.getCell(b);
			//System.out.println(cell);
			int cellType = cell.getCellType();
			if(cellType==1) {
				value = cell.getStringCellValue();
				System.out.println(value);
			}else if(cellType==0) {
				if(DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
			value = s.format(dateCellValue);
			System.out.println(value);
			
				}else {
					double number = cell.getNumericCellValue();
					long l = (long)number;
					value = String.valueOf(l);
					System.out.println(value);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
		}
	
	public static void selectValue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}
	
	public static void typedata(WebElement element, String data) {
		element.sendKeys(data);
	}
	
	public static void clickdata(WebElement element) {
		element.click();
	}
	public static void cleardata(WebElement element) {
		element.clear();
	}
	public static String propertiesConfig(String Key) {
		String value=null;
		File f= new File("D:\\Benazir\\Programs\\Sample_Maven\\src\\test\\resources\\TestData\\config.properties");
		try {
			FileInputStream fis = new FileInputStream (f);
			Properties p=new Properties();
				p.load(fis);
				value=p.getProperty(Key);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return value;
		} 
	public static void screenshot() {
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			Files.copy(f, new File("C:\\Users\\Admin\\samplescreenshot.jpeg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

		
	}



