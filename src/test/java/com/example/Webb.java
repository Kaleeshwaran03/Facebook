package com.example;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class Webb {
	    public static void main(String[] args) throws InterruptedException {
	      
	        WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	       
	        driver.get("https://www.facebook.com");
	        driver.manage().window().maximize();
	        
	       WebElement user = driver.findElement(By.xpath("//input[contains(@name,\"email\")]"));
	       
	       if(user.isDisplayed()) {
	    	   user.sendKeys("kaleesh@0725");
	       Thread.sleep(3000);
	       user.clear();
	       user.sendKeys("krish@gmail.com");
	       } 
	       
	      String Attribute = user.getAttribute("value");
	      System.out.println(Attribute);
	      
	       WebElement pass = driver.findElement(By.name("pass"));
	       pass.sendKeys("545245");
	       
	       driver.findElement(By.xpath("//button[@name='login']")).click();
	       
	       // List<WebElement> link = driver.findElements(By.tagName("a"));
	        	       
	        System.out.println("Page title is: " + driver.getTitle());	       
	    }
}