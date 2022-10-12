package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://magento-demo.lexiconn.com/");
        WebElement label = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/a[3]/span[2]"));
        label.click();
        WebElement Select_label = driver.findElement(By.xpath("//*[@id=\"header-account\"]/div/ul/li[2]/a"));
        Select_label.click();
        WebElement create_account = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div[2]/a"));
        create_account.click();
        WebElement FirstName = driver.findElement(By.xpath("//*[@id=\"firstname\"]"));
        WebElement LastName = driver.findElement(By.xpath("//*[@id=\"lastname\"]"));
        WebElement emailaddress = driver.findElement(By.xpath("//*[@id=\"email_address\"]"));
        WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        WebElement confrimpassword = driver.findElement(By.xpath("//*[@id=\"confirmation\"]"));
        WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div[2]/button/span/span"));
        WebElement register = driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div[2]/button/span/span"));
        FirstName.sendKeys("Elsayed");
        LastName.sendKeys("Hassan");
        emailaddress.sendKeys("test0000@gmail.com");
        password.sendKeys("Aly*9494*");
        confrimpassword.sendKeys("Aly*9494*");
        checkbox.click();
        register.click();


    }
}

