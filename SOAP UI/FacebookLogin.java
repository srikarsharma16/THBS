package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver//chromedriver.exe");
		ChromeDriver c = new ChromeDriver();
		c.get("https://www.facebook.com");
		c.findElement(By.name("email")).sendKeys("srikar@gmail.com");
		c.findElement(By.name("pass")).sendKeys("1234567");
		c.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
	}

}
