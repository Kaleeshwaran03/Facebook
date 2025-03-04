package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class SeleniumTaskScreenshot {
    public static void main(String[] args) throws IOException {
              
            WebDriverManager.chromedriver().setup();
            WebDriver A = new ChromeDriver();
                         
            A.get("http://demo.guru99.com/test/drag_drop.html");
            A.manage().window().maximize();
            
            Actions B = new Actions(A);
            
            List<WebElement> src = A.findElements(By.xpath("//li[contains(@class, 'block')]"));            
            List<WebElement> tar = A.findElements(By.xpath("//ol[contains(@class, 'drop')]"));

            for (WebElement source : src) {
                for (WebElement target : tar) {
                    B.dragAndDrop(source, target).perform();
                }
            }          
            File screenshot = ((TakesScreenshot) A).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot, new File("screenshot.png"));
           
        }     
}



