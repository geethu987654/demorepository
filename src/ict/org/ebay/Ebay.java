package ict.org.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ebay {
	
public static void main(String[]args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.ebay.com/");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@aria-label='Search for anything']")).sendKeys("smartwatches");
	Select category = new Select(driver.findElement(By.id("gh-cat")));
    Thread.sleep(1000);
    category.selectByVisibleText("Cell Phones & Accessories");
    driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
}

}

