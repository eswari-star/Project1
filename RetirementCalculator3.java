//Test user storey2: Acceptance criteria:3
//User whose current aged 55 is not employed, current KiwiSaver balance is $140000, voluntary contributes $10 annually and chooses Balanced risk profile with saving goals requirement of $200000 is able to calculate his projected balances at retirement.




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;



public class RetirementCalculator3 {

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
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
		//Switch to iframe to find the text box element for current age		
				driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\'calculator-embed\']/iframe")));
				
		//mouse hover over for current age textbox and sending keys								
		 		WebElement currentage=driver.findElement(By.xpath("//*[@id='widget']/div/div[1]/div/div[1]/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div/div[1]/div/div[1]/div/div/input"));
				actions.moveToElement(currentage).click().sendKeys("55").build().perform();
				
			
		 // mouse hover over for dropdown field
			    WebElement dpdown = driver.findElement(By.xpath("//*[@id='widget']/div/div[1]/div/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div/div/div/div[1]/div"));
				 actions.moveToElement(dpdown).click().build().perform();
			
				 				
			//Select value Not-Employed from dropdown	 
				 WebElement Notemployed= driver.findElement(By.xpath("//*[@id='widget']/div/div[1]/div/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div/div/div/div[2]/ul/li[4]"));
				actions.moveToElement(Notemployed).click().build().perform();
				
			//sending values to Kiwisaver balance textbox
				 WebElement Kiwisaverbal=driver.findElement(By.xpath("//*[@id='widget']/div/div[1]/div/div[1]/div/div[3]/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div/div/input"));
				 actions.moveToElement(Kiwisaverbal).click().sendKeys("140000").build().perform();
				 
			//sending values to voluntary contributions
				 WebElement vcont=driver.findElement(By.xpath("//*[@id='widget']/div/div[1]/div/div[1]/div/div[4]/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div[1]/div/input"));
				 actions.moveToElement(vcont).click().sendKeys("10").build().perform();
				 
			//mouse hover over for dropdown-voluntrycontribution-period
				 
				    WebElement dropdown = driver.findElement(By.xpath("//*[@id=\'widget\']/div/div[1]/div/div[1]/div/div[4]/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div[2]/div/div[1]/div"));
					 actions.moveToElement(dropdown).click().build().perform();
					 
			//selecting dropdown value annually	
					 WebElement Annual= driver.findElement(By.xpath("//*[@id='widget']/div/div[1]/div/div[1]/div/div[4]/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div[2]/div/div[2]/ul/li[5]"));
					 actions.moveToElement(Annual).click().build().perform(); 
				 

				 
			//click radio button balanced risk profile
				 
				 WebElement BRbtn1=driver.findElement(By.xpath("//*[@id='widget']/div/div[1]/div/div[1]/div/div[5]/div/div/div/div[2]/div[1]/div[1]/div/div/div/div/div[3]/div/label"));
				 actions.moveToElement(BRbtn1).click().build().perform(); 
				 
			//sending input values for savings goal
				 WebElement Sgoal=driver.findElement(By.xpath("//*[@id='widget']/div/div[1]/div/div[1]/div/div[6]/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div/div/input"));
				 actions.moveToElement(Sgoal).click().sendKeys("200000").build().perform();
				 
			//clicking the view your kiwisaver retirement projection
				 WebElement Projectionbtn=driver.findElement(By.xpath("//*[@id=\'widget\']/div/div[1]/div/div[2]"));
				 actions.moveToElement(Projectionbtn).click().build().perform(); 
	
	
		
	}


}
