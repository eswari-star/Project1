import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Westpac {

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
//clicking the button in the webpag - click here to get started		
	    WebElement btn = driver.findElement(By.linkText("Click here to get started."));
	    actions.moveToElement(btn);
		actions.click().build().perform();
//Switch to iframe to find the text box element for current age		
  		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\'calculator-embed\']/iframe")));
		WebElement text=driver.findElement(By.xpath("//*[@id='widget']/div/div[1]/div/div[1]/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div/div[1]/div/div[1]/div/div/input"));
		actions.moveToElement(text).click().sendKeys("60").build().perform();
// clicking the information icon.		
		WebElement icon=driver.findElement(By.xpath("//*[@id='widget']/div/div[1]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/button/i"));
	    actions.moveToElement(icon).click().build().perform();
		
	   
	//have to print the tooltip text for the help icon
	//System.out.println(driver.findElement(By.id("content")).getText());	
		
	
		
		
	}

	
	

}
