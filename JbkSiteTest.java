package com.thekiranacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class JbkSiteTest {

	@Test
	public void loginTest() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///G:/Setup/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/add_user.html");
		//	  driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		//	  driver.findElement(By.id("password")).sendKeys("123456");
		//	  driver.findElement(By.xpath("//button")).click();
		WebElement we = null;
		we = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select"));
		we.click();
		Select sel = new Select(we);
		sel.selectByIndex(2);



	}
}
