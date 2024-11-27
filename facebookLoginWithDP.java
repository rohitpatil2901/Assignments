package testNgAutomationScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class facebookLoginWithDP {

	@DataProvider(name="logindetails")
	public Object [][] dataforfb(){
		
		Object data[][]=new Object[4][2];
		
		data[0][0]="Rohit";
		data[0][1]="patil";
		
		data[1][0]="InvalidUN";
		data [1][1]="InvalidPW";
		
		data[2][0]="ValidUN";
		data[2][1]="InvalidPW";
		
		data[3][0]="InvaliUN";
		data[3][1]="validPW";
		
		return data;
		
		
	}
	
	@Test(dataProvider="logindetails")
	public void facebookUNPW(String UserName,String PassWord) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/?_rdr");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys(UserName);
		driver.findElement(By.name("pass")).sendKeys(PassWord);
		//driver.close();
	}
}
