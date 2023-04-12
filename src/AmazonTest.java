import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		
	WebElement searchBx = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
	searchBx.sendKeys("samsung mobile");
	
	WebElement searchBtn = driver.findElement(By.xpath("//input[@type='submit']"));
	searchBtn.click();
	
	
	List<WebElement> productsNames = driver.findElements(By.xpath("//div[@class='a-section']//h2//span"));
//	System.out.println("The total number of elements are" + productsNames.size());
	
	List<WebElement> pPrice = driver.findElements(By.xpath("//div[@class='sg-row']/following::span[@class='a-price-whole'][1]"));
	
	List<WebElement> symbol = driver.findElements(By.xpath("//div[@class='sg-row']/following::span[@class='a-price-symbol'][1]"));
	
	for(int i=0;i<productsNames.size();i++) {
		
		System.out.println("Product:" + productsNames.get(i).getText());
		System.out.println("Price" + symbol.get(i).getText() +"" + pPrice.get(i).getText());
	}
		

	}

}
