package org.example;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static <ChromeOptions, WebDriver, driver> void main(String[] args )
    {
        System.out.println( "Hello World!" );

        System.setProperty(
                "webdriver.chrome.driver", "src/main/resources/chromedriver.exe."
        );




        org.openqa.selenium.chrome.ChromeOptions chromeOptions = new org.openqa.selenium.chrome.ChromeOptions();
        chromeOptions.addArguments("incognito");

        WebDriverManager.chromedriver().setup();

        org.openqa.selenium.WebDriver driver = new ChromeDriver();
        driver.get("https://crm.geekbrains.space/user/login");


        WebElement webElement = driver.findElement(By.name("q"));
        webElement.click();
        webElement.sendKeys("user");

        webElement.click();
        webElement.sendKeys("1234");

        List<WebElement> WebElements = driver.findElements(By.name("q"));
        driver.getWindowHandle();

//        driver.quit();




    }

}

