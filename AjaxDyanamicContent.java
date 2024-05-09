package Heroku_Practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AjaxDyanamicContent {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://webdriveruniversity.com/");
		
			WebElement ajaxLink = driver.findElement(By.xpath("//a[@id='ajax-loader']"));
			ajaxLink.click();
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='loader']")));
			
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@id='loader']")));
			
			WebElement clickMe = driver.findElement(By.xpath("//span[@id='button1']/p"));
			clickMe.click();
		
	}

}
