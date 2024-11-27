package testNgAutomationScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AmazonSearchWithDP {

	@DataProvider(name="AmazonSearch")
	
	public Object[][] searchValues(){
		
		Object[][] search=new Object[4][1];
		search[0][0]="Shoes";
		search[1][0]="Mobile";
		search[2][0]="Fashion Cloth";
		search[3][0]="Home Appliances";
		
		return search;
		
	}
	
	@Test(dataProvider="AmazonSearch")
	public void amazonsearchDP(String valueOfProduct) throws InterruptedException{
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(valueOfProduct);
		
	}
}
