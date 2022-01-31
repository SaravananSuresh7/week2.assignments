package week2.assignments1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Saravanan");
		driver.findElement(By.name("lastname")).sendKeys("Suresh");
		driver.findElement(By.name("reg_email__")).sendKeys("9876543210");
		driver.findElement(By.id("password_step_input")).sendKeys("Avengers@123");
		WebElement day = driver.findElement(By.id("day"));
		Select dd = new Select(day);
		dd.selectByVisibleText("7");
		WebElement month = driver.findElement(By.id("month"));
		Select mm = new Select(month);
		mm.selectByVisibleText("Oct");
		WebElement year = driver.findElement(By.id("year"));
		Select yy = new Select(year);
		yy.selectByVisibleText("1997");
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
	}

}
