package Week3.Day2;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AJioAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("Bags" , Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		String text=driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println("Number of the items found:" + text);
		//get the list of brands
		System.out.println("*****list of brands****");
		List<WebElement> brand=driver.findElements(By.xpath("//div[@class='brand']"));
		WebElement name;
		Set<String> Bags=new LinkedHashSet<String>();
		for(int i=0;i<brand.size();i++)
		{
			name=brand.get(i);
			String str=name.getText();
			Bags.add(str);
		}
		for(String BrandName:Bags)
		{
			System.out.println("BrandName:" + BrandName);
		}
		System.out.println("*******list of BagNames****");
		List<WebElement> bagName=driver.findElements(By.xpath("//div[@class='name']"));
		WebElement name1;
		Set<String> Bags1=new LinkedHashSet<String>();
		for(int i=0;i<bagName.size();i++)
		{
			name1=bagName.get(i);
			String str1=name1.getText();
			Bags.add(str1);
		}
		for(String BagName:Bags)
		{
			System.out.println("BagName:" + BagName);
		}



		

	}

}
