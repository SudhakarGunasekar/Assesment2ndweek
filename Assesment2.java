package workout.session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assesment2 {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();	
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Cognizant");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sudhakar");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Gunasekar");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sudha");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("I have 8 years of experience in Cognizant");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sudhakar5689@gmail.com");
		
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		
		Select sec = new Select(state);
		
		sec.selectByVisibleText("New York");
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("submitButton")).click();
				
		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.id("updateLeadForm_description")).clear();
		
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Relevant Experience 5 years");
		
		driver.findElement(By.name("submitButton")).click();		
		
		driver.getTitle();
				
		
		
	}


}
