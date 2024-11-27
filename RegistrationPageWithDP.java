package testNgAutomationScenarios;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegistrationPageWithDP {

	@DataProvider(name="registerDetails")
	
	public Object [][] regDetails(){
		
		Object [][] regData= new Object[7][7];
		regData[0][0]="Rohit";
		regData[0][1]="Patil";
		regData[0][2]="rp@gmail.com";
		regData[0][3]="rppass";
		regData[0][4]="rp present address";
		regData[0][5]="rp permanent address";
		regData[0][6]="400001";
		
		regData[1][0]="Avinash";
		regData[1][1]="Kumar";
		regData[1][2]="ak@gmail.com";
		regData[1][3]="akpass";
		regData[1][4]="ak present address";
		regData[1][5]="ak permanent address";
		regData[1][6]="400002";
		
		regData[2][0]=" Monika";
		regData[2][1]="Jain";
		regData[2][2]="mi@gmail.com";
		regData[2][3]="mjpass";
		regData[2][4]="mj present address";
		regData[2][5]="mj permanent address";
		regData[2][6]="400003";
		
		regData[3][0]="Tanishka";
		regData[3][1]="Modi";
		regData[3][2]="tm@gmail.com";
		regData[3][3]="tmpass";
		regData[3][4]="tm present address";
		regData[3][5]="tm permanent address";
		regData[3][6]="400004";
		
		regData[4][0]="Manish";
		regData[4][1]="Tiwari";
		regData[4][2]="mt@gmail.com";
		regData[4][3]="mtpass";
		regData[4][4]="mt present address";
		regData[4][5]="mt permanent address";
		regData[4][6]="400005";
		
		return regData;
	}
		
	
	@Test(dataProvider="registerDetails")
	public void registrationPage(String FirstName, String LastName, String Email, String password, String PresentAddress, String PermanentAddress, String PinCode) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("fname")).sendKeys(FirstName);
		
		
		driver.findElement(By.name("lname")).sendKeys(LastName);
		
		  JavascriptExecutor js = (JavascriptExecutor) driver;
	        
	        js.executeScript("window.scrollBy(0, 450)");
	        Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys(Email);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.id("male")).click();
		
		 
      
		
		Select skills=new Select(driver.findElement(By.name("Skills")));
		skills.selectByValue("select1");
		
		Select country=new Select(driver.findElement(By.name("Country")));
		country.selectByValue("China");
		
		driver.findElement(By.id("Present-Address")).sendKeys(PresentAddress);
		driver.findElement(By.id("Permanent-Address")).sendKeys(PermanentAddress);
		driver.findElement(By.name("Pincode")).sendKeys(PinCode);
		
		
		Select religion=new Select(driver.findElement(By.name("Relegion")));
		religion.selectByValue("Hindu");
		
		WebElement uploadFile=driver.findElement(By.name("file"));
		uploadFile.sendKeys("C:\\Users\\V-Rohit.Patil\\Downloads\\test 1.txt");
		
		
		
		driver.findElement(By.xpath("//input[@class='relocate form-check-input']")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(2000);
		
		Alert alrt=driver.switchTo().alert();
		String str=alrt.getText();
		System.out.println("Alert message: "+str);
		alrt.accept();
		driver.close();
			
	}
}
