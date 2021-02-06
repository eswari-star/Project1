//Test user storey2: Acceptance Criteria#2
// User whose current aged 45 is Self-employed, current KiwiSaver balance is $100000, voluntary contributes $90 fortnightly and chooses Conservative risk profile with saving goals requirement of $290000 can calculate his projected balances at retirement.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;



public class RetirementCalculator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Eswari\\chromedriver.exe" );
  		WebDriver driver=new ChromeDriver();
  		driver.manage().window().maximize();
		driver.get("https://www.westpac.co.nz");
		
		//mouse hover over action to the Kiwisaver menu	
				Actions actions = new Actions(driver);
				WebElement mainMenu = driver.findElement(By.xpath("//*[@id='ubermenu-section-link-kiwisaver-ps']"));
				actions.moveToElement(mainMenu);
				
		// clicking the submenu under Kiwisaver
				WebElement subMenu = driver.findElement(By.cssSelector("#ubermenu-item-cta-kiwisaver-calculators-ps"));
				actions.moveToElement(subMenu);
				actions.click().build().perform();
				
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				
		//clicking the button in the webpag - click here to get started		
			    WebElement btn = driver.findElement(By.linkText("Click here to get started."));
			    actions.moveToElement(btn);
				actions.click().build().perform();
				
		//wait till the page loads
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
		//Switch to iframe to find the text box element for current age		
				driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\'calculator-embed\']/iframe")));
				
		//mouse hover over for current age textbox and sending keys								
		 		WebElement currentage=driver.findElement(By.xpath("//*[@id='widget']/div/div[1]/div/div[1]/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div/div[1]/div/div[1]/div/div/input"));
				actions.moveToElement(currentage).click().sendKeys("45").build().perform();
				
				
			
				// mouse hover over for dropdown field
			    WebElement dpdown1 = driver.findElement(By.xpath("//*[@id='widget']/div/div[1]/div/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div/div/div/div[1]/div"));
				 actions.moveToElement(dpdown1).click().build().perform();
			
				 				
			//Select value Self-Employed from dropdown	 
				 WebElement Selfemployed= driver.findElement(By.xpath("//*[@id='widget']/div/div[1]/div/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div/div/div/div[2]/ul/li[3]"));
				 actions.moveToElement(Selfemployed).click().build().perform();
				
			//sending values to Kiwisaver balance textbox
				 WebElement Kiwisaverbal=driver.findElement(By.xpath("//*[@id='widget']/div/div[1]/div/div[1]/div/div[3]/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div/div/input"));
				 actions.moveToElement(Kiwisaverbal).click().sendKeys("10000").build().perform();
				 
			//sending values to voluntary contributions
				 WebElement vcont=driver.findElement(By.xpath("//*[@id='widget']/div/div[1]/div/div[1]/div/div[4]/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div[1]/div/input"));
				 actions.moveToElement(vcont).click().sendKeys("90").build().perform();
				 
			//mouse hover over for dropdown-voluntrycontribution-period
				 
				    WebElement dropdown = driver.findElement(By.xpath("//*[@id=\'widget\']/div/div[1]/div/div[1]/div/div[4]/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div[2]/div/div[1]/div"));
					 actions.moveToElement(dropdown).click().build().perform();
					 
			//selecting dropdown value fortnightly	
					 WebElement Fortnight= driver.findElement(By.xpath("//*[@id='widget']/div/div[1]/div/div[1]/div/div[4]/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div[2]/div/div[2]/ul/li[3]"));
					 actions.moveToElement(Fortnight).click().build().perform(); 
				 

				 
			//click radio button conservative risk profile
				 
				 WebElement CRbtn1=driver.findElement(By.xpath("//*[@id='widget']/div/div[1]/div/div[1]/div/div[5]/div/div/div/div[2]/div[1]/div[1]/div/div/div/div/div[2]"));
				 actions.moveToElement(CRbtn1).click().build().perform(); 
				 
			//sending input values for savings goal
				 WebElement Sgoal=driver.findElement(By.xpath("//*[@id='widget']/div/div[1]/div/div[1]/div/div[6]/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div/div/input"));
				 actions.moveToElement(Sgoal).click().sendKeys("29000").build().perform();
				 
			//clicking the view your kiwisaver retirement projection
				 WebElement Projectionbtn=driver.findElement(By.xpath("//*[@id=\'widget\']/div/div[1]/div/div[2]"));
				 actions.moveToElement(Projectionbtn).click().build().perform(); 
	
	
		
	}


}
