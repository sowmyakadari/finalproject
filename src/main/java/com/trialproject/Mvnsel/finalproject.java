package com.trialproject.Mvnsel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;

public class finalproject {
	public static void main(String[] args) {
		FirefoxDriver dr=new FirefoxDriver();
		dr.get("http://www.google.com");
	    dr.manage().window().maximize();
	    dr.findElement(By.id("APjFqb")).sendKeys("java tutorial");
	    dr.findElement(By.xpath(("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]"))).click();
	    dr.findElement(By.xpath("/html/body/div[5]/div/div[10]/div/div[2]/div[2]/div/div/div[1]/div/div/div[1]/div/div/span/a/h3")).click();
	    dr.findElement(By.xpath("/html/body/div[5]/div[1]/div[1]/div[2]/a[2]")).click();
	    JavascriptExecutor js=(JavascriptExecutor)dr;
	    js.executeScript("window.scrollBy(0,750)");
	}
}
