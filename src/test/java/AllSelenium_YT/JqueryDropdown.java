package AllSelenium_YT;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropdown {
	@Test
	public void jqueryDdn() {
WebDriverManager.firefoxdriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.id("justAnInputBox")).click();//for clicking the dropdownbox
 selectChioceValue(driver,"choice 1");//we can select single value i.e if we pass
 //selectChioceValue(driver,"choice 1","choice 2","choice 1 2");//we can select 2 or 3 choices
 //selectChioceValue(driver,"all");//we can select all values
	}
 public static void selectChioceValue(WebDriver driver, String...value) {//This string can store single and multple values
//In java String ... is there to store multiple and single elements as well
List<WebElement> checkListValue=driver.findElements(By.xpath("//span[@class=\"comboTreeItemTitle\"]"));
//this xpath is showing 44 elements because it is giving other dropdown elements also
if(!value[0].equalsIgnoreCase("all")) {
	//this if condition is cheecking the value is single choice or multiple choice 
	//if !value[0] means, 0 index means 1st value and not equal to all option then it will enter into the loop
	for(WebElement item :checkListValue) {
	//read each check list value and capturing that text value
	String text=item.getText();
	for(String val:value) {
 //if this value may contains the multiple values so read each and every value	
	if(val.equals(text)){//if text is equal to expected val then click on that option(item)
	item.click();
	break;
  }}}}}}
	

