package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		//open the page
		driver.get("https://training-support.net/");
		//Verify the page using title
		System.out.println("Title of the page is: " +driver.getTitle());
		
		//Find and click the about us link
		//driver.findElement(By.linkText("About Us")).click(); //locating using linkText
		driver.findElement(By.cssSelector("a.card")).click(); //locating using css selector 
		//driver.findElement(By.className("card")).click();  //locating using class name
		
		//Print the title of the new page
		System.out.println("Title of the new page is: " +driver.getTitle());
		
		//Close the browser
		driver.close();
		
		
	}

}
