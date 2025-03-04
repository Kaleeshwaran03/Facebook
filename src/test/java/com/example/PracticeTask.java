package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeTask {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver ab = new ChromeDriver();
		String url = "https://www.flipkart.com/" ;
		ab.get(url);
		ab.manage().window().maximize();
		
		System.out.println("Website Title" + ab.getTitle());
		
		ab.switchTo().newWindow(WindowType.TAB);
		
		String CurrentUrl = ab.getCurrentUrl();
		System.out.println("CurrentUrl");
		
		if(url.equals(CurrentUrl)) {
		System.out.println("url is matched");
		}
		else {
			System.out.println("url is not matched");
		}
		
		
		
		
		ab.quit();
		

	}

}
