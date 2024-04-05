package AllSelenium_YT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getTextVsgetAttributeValue {
@Test
public void getTextVsgetAttributevalue() {
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://admin-demo.nopcommerce.com/login");
	WebElement emailInput=driver.findElement(By.id("Email"));
 //	emailInput.clear();//this method will clear the text inside the email input box
 //	emailInput.sendKeys("abc@gmail.com");
	System.out.println("value of the email text: "+emailInput.getAttribute("value"));//to get the value of the attribute
	System.out.println("text of the email: "+emailInput.getText());//to get the inner text of the element
	WebElement loginbtn = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	System.out.println(loginbtn.getAttribute("type"));
	System.out.println(loginbtn.getAttribute("class"));
	System.out.println(loginbtn.getText());		
    }
  }
