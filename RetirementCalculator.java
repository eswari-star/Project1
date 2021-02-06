// User Story2 - Acceptance Criteia 1
//User whose Current age is 30 is Employed @ a Salary 82000 p/a, contributes to KiwiSaver @ 4% and chooses a Defensive risk profile can calculate his projected balances at retirement.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;



public class RetirementCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Eswari\\chromedriver.exe" );
  		WebDriver driver=new ChromeDriver();
  		driver.manage().window().maximize();
	
				
  		driver.get("https://www.westpac.co.nz/kiwisaver/calculators/kiwisaver-calculator/");
		
 		 
  		Actions actions = new Actions(driver);
				
		//Switch to iframe to find the text box element for current age		
				driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\'calculator-embed\']/iframe")));
				
				WebDriverWait wait = new WebDriverWait(driver, 15);
			WebElement text= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'widget\']/div/div[1]/div/div[1]/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div/div[1]/div/div[1]/div/div/input")));
				
								
		 //		WebElement text=driver.findElement(By.xpath("//*[@id='widget']/div/div[1]/div/div[1]/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div/div[1]/div/div[1]/div/div/input"));
				actions.moveToElement(text).click().sendKeys("30").build().perform();
				
		// clicking the information icon.		
				WebElement icon=driver.findElement(By.xpath("//*[@id='widget']/div/div[1]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/button/i"));
			    actions.moveToElement(icon).click().build().perform();
		
			 // mouse hover over for dropdown field
			    WebElement dpdown = driver.findElement(By.xpath("//*[@id='widget']/div/div[1]/div/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div/div/div/div[1]/div"));
				 actions.moveToElement(dpdown).click().build().perform();
			
				 				
			//Select value Employed from dropdown	 
				WebElement Employed= driver.findElement(By.xpath("//*[@id='widget']/div/div[1]/div/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div/div/div/div[2]/ul/li[2]"));
				actions.moveToElement(Employed).click().build().perform();
				
			//sending values to salary textbox
				WebElement stext=driver.findElement(By.xpath("//*[@id=\'widget\']/div/div[1]/div/div[1]/div/div[3]/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div/div/input"));
				 actions.moveToElement(stext).click().sendKeys("82000").build().perform();
				 
			//click radio button 4%
				 WebElement Rbtn1=driver.findElement(By.xpath("//*[@id=\'widget\']/div/div[1]/div/div[1]/div/div[4]/div/div/div/div[2]/div[1]/div[1]/div/div/div/div/div[2]"));
				 actions.moveToElement(Rbtn1).click().build().perform(); 
			//click radio button Defensive
				 
				 WebElement Dbtn1=driver.findElement(By.xpath("//*[@id=\'widget\']/div/div[1]/div/div[1]/div/div[7]/div/div/div/div[2]/div[1]/div[1]/div/div/div/div/div[1]/div/label"));
				 actions.moveToElement(Dbtn1).click().build().perform(); 
				 
			//clicking the view your kiwisaver retirement projection
				 WebElement Projectionbtn=driver.findElement(By.xpath("//*[@id=\'widget\']/div/div[1]/div/div[2]"));
				 actions.moveToElement(Projectionbtn).click().build().perform(); 
		
			
		
	}

	
}
