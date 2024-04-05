package AllSelenium_YT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StatusOfTheElement {
	@Test    
	public void statusOfWebElement() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		//isDisplayed():it will check weather the element is there or not
		//isEnabled():it will check weather the element is allowing to pass the element or not
		WebElement searchStore=driver.findElement(By.id("small-searchterms"));
		System.out.println("Display status: "+searchStore.isDisplayed());
		System.out.println("Enabled status: "+searchStore.isEnabled()); 
		//click on register
		WebElement register = driver.findElement(By.xpath("//a[text()=\"Register\"]"));
		register.click();

		WebElement	maleRadiobtn=driver.findElement(By.id("gender-male"));
		WebElement femaleRadiobtn=driver.findElement(By.id("gender-female"));
		System.out.println("status of male radio button:"+maleRadiobtn.isSelected());//before clicking the radio btn--false
		System.out.println("status of female radio button: "+femaleRadiobtn.isSelected());//before clicking the radio btn--false

		maleRadiobtn.click();//clicking the male radio btn   
		System.out.println("status of male radio button:"+maleRadiobtn.isSelected());//true
		System.out.println("status of female radio button: "+femaleRadiobtn.isSelected());//false

		femaleRadiobtn.click();//clicking the female radio btn
		System.out.println("status of male radio btn: "+maleRadiobtn.isSelected());//false
		System.out.println("status of female radio button: "+femaleRadiobtn.isSelected());//true
	
	}
}
