package mayweek2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//Launch URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		// Windows maximize
		driver.manage().window().maximize();
		//Enter username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//Enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click the login
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Click Leads link
		driver.findElement(By.linkText("Leads")).click();
		Thread.sleep(3000);
		//Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		//Click Email
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		//Enter Email
		driver.findElement(By.name("emailAddress")).sendKeys("hariprasa49@gmail.com");
		//Click Find Lead
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//Click on Email
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		//Enter Email
		driver.findElement(By.xpath("(//div[@class='x-form-element']//input[@class=' x-form-text x-form-field '])"));
		//Click Find Lead
		driver.findElement(By.className("x-btn-center")).click();
		//Click First Resulting lead
		driver.findElement(By.xpath("//a[text()='10647']/..")).click();
		//Click Duplicate Lead
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']//a[1]")).click();
		//Verify the title as 'Duplicate Lead'
		System.out.println("//div[text()='Duplicate Lead']");
		//Click Create Lead
		driver.findElement(By.className("smallSubmit")).click();
		//Close the browser
		driver.close();
		
		
		
	}

}
