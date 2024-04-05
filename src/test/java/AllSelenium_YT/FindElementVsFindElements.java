package AllSelenium_YT;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementVsFindElements {
@Test
public void findElementVsfindElements() {
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/");
	//1)findElement() will return single element
	WebElement searchStore=driver.findElement(By.id("small-searchterms"));
	searchStore.sendKeys("XYZ");
	//2)If webElement is not finding the element on the web page then it will  through any exception
//	WebElement searchbtn=driver.findElement(By.xpath("//button[text()=\"Login\"]"));
//	searchbtn.click();
	//3)if locator is finding multiple elements on the web still it is giving 1st element only
    WebElement footerEle=driver.findElement(By.xpath("//div[@class=\"footer-upper\"]//a"));
    System.out.println(footerEle.getText());
    
    //1)findElements() return the list of elements
   List<WebElement> footerElements = driver.findElements(By.xpath("//div[@class=\"footer-upper\"]//a"));  
   System.out.println("Number of elements captured: "+footerElements.size());//22
   
  for(WebElement footerElement:footerElements) {
	  System.out.println(footerElement.getText());
  }
//2)if web element is not found on the web page then it will not through any exception instead of that it will give 0 elements
   List<WebElement> electronicsEle = driver.findElements(By.xpath("//img[contains(title,'Electronics')]"));
   System.out.println("Elements captured under electronics: "+electronicsEle.size());//0 Elements            
}
  }