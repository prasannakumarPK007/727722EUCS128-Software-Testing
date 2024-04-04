package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();

        WebDriver chromedriver = new ChromeDriver();
        WebDriver ffdriver = new FirefoxDriver();

        chromedriver.manage().window().maximize();
        ffdriver.manage().window().minimize();

        chromedriver.get("https://www.google.com");
        ffdriver.get("https://www.google.com");

        ffdriver.findElement(By.name("q")).sendKeys("Apple");
        chromedriver.findElement(By.name("q")).sendKeys("Samsung");

        ffdriver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        chromedriver.findElement(By.name("q")).sendKeys(Keys.ENTER);



        // WebDriverManager.firefoxdriver().setup();
        // // WebDriverManager.chromedriver().setup();
        // // WebDriverManager.edgedriver().setup();
        // WebDriver driver = new FirefoxDriver();
        // driver.manage().window().maximize();
        // driver.get("https://demoblaze.com/");
        // Thread.sleep(5000);
        // driver.findElement(By.linkText("Laptops")).click();
        // Thread.sleep(5000);
        // driver.findElement(By.linkText("MacBook air")).click();
        // Thread.sleep(5000);
        // driver.findElement(By.linkText("Add to cart")).click();
        // Thread.sleep(5000);
        // driver.switchTo().alert().accept();
        // driver.findElement(By.linkText("Cart")).click();
        // Thread.sleep(5000);
        // String title=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr/td[2]")).getText();
        // String price=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr/td[3]")).getText();
        // System.out.println(title+" "+price);
        // Thread.sleep(2000);
        // driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/button")).click();
        // Thread.sleep(3000);
        // driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("John Doe");
        // driver.findElement(By.xpath("//*[@id=\"country\"]")).sendKeys("Vinland");
        // driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Manchester City");
        // driver.findElement(By.xpath("//*[@id=\"card\"]")).sendKeys("Deez Nuts");
        // driver.findElement(By.xpath("//*[@id=\"month\"]")).sendKeys("24");
        // driver.findElement(By.xpath("//*[@id=\"year\"]")).sendKeys("1936");
        // Thread.sleep(2000);
        // driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]")).click();
        // Thread.sleep(5000);
        // driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button")).click();
        




        // WebDriverManager.edgedriver().setup();
        // WebDriver driver = new EdgeDriver();
        // String IAM_NEO = "https://www.flipkart.com/";
        // driver.get(IAM_NEO);
        // driver.manage().window().maximize();
        // Thread.sleep(7000);
        // driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/div[1]/header/div[1]/div[2]/form/div/div/input")).sendKeys("iphone 15");
        // driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/div[1]/header/div[1]/div[2]/form/div/div/input")).sendKeys(Keys.ENTER);




    }
}
