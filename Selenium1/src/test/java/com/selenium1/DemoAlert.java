package com.selenium1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAlert {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//input[@id='email'];
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("abc@gmail.com");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("12345");
		WebElement loginbtn = driver.findElement(By.id("loginbutton"));
		loginbtn.click();
	   
	}

}
