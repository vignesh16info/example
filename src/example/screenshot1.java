package example;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot1 {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\INTEL\\Desktop\\chrome\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
	    
	    d.get("https://www.rediff.com/");
	    Thread.sleep(3000);
	    
	    File sr= ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(sr,new File ("C:\\Users\\INTEL\\Desktop\\java\\file utils\\rohit.jpeg"));

	    d.close();
	}
	}
