package Heroku_Practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DyanamicContentPageLoading2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		
		driver.findElement(By.xpath("//div[@id='start']/button")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='loading']/img")));
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@id='loading']/img")));
		
		WebElement textElement = driver.findElement(By.xpath("//div[@id='finish']/h4"));
		String text = textElement.getText();
		System.out.println(text);
		
		driver.quit();
	}

}
