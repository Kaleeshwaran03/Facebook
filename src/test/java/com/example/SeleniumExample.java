package com.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumExample {
    public static void main(String[] args) {
        // Setup chrome driver threough Web Driver Manager
        WebDriverManager.chromedriver().setup();

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to Google
            driver.get("https://www.google.com");

            // Find the search box using its name attribute
            WebElement searchBox = driver.findElement(By.name("q"));

            // Type "Selenium" in the search box
            searchBox.sendKeys("Selenium");

            // Submit the search form
            searchBox.submit();

            // Wait for a few seconds to see the results
            Thread.sleep(2000); // Not recommended for production code; use WebDriverWait instead

            // Print the title of the current page
            System.out.println("Page title is: " + driver.getTitle());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}

