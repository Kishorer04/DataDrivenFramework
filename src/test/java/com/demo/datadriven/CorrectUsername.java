package com.demo.datadriven;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CorrectUsername {

@Test
@Parameters({"username","password"})
 public void loginWithCorrectUserName(String uname, String pword) {
 WebDriver driver = new ChromeDriver();
 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 
 WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
 userName.sendKeys(uname);
 
 WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
 password.sendKeys(pword);
 
 WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
 loginButton.click();
 

 
 
 }
}
