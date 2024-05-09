package Heroku_Practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DyanamicContentPAgeLoading {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		
		WebElement startButton = driver.findElement(By.xpath("//div[@id='start']/button"));
		startButton.click();
		
		//Waiting for Element to be Located
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@id='loading']/img")));;
		
		//waiting for Element to be invisible
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@id='loading']/img")));
		
		WebElement loadingIcon = driver.findElement(By.xpath("//div[@id='finish']/h4"));
		String text = loadingIcon.getText();
		System.out.println(text);
		
		driver.quit();
		
	}

}
