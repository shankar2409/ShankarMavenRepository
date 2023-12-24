package section1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class olympicsMedalPrint {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://olympics.com/en/olympic-games/tokyo-2020/medals");
		List<WebElement> countryName=driver.findElements(By.xpath("//span[@data-cy='country-name']"));
		List<WebElement> gold=driver.findElements(By.cssSelector("[title='Gold']"));
		List<WebElement> silver=driver.findElements(By.cssSelector("[title='Silver']"));
		List<WebElement> bronze=driver.findElements(By.cssSelector("[title='Bronze']"));
		for(int i=0;i<countryName.size();i++)
		{
			String country_name=countryName.get(i).getText();
			String gold_medals=gold.get(i).getText();
			String silver_medals=silver.get(i).getText();
			String bronze_medals=bronze.get(i).getText();
			if(gold_medals.equals("-"))
				gold_medals="0";
			if(silver_medals.equals("-"))
				silver_medals="0";
			if(bronze_medals.equals("-"))
				bronze_medals="0";
			System.out.println(country_name+"----> "+gold_medals+"---"
					+ ">"+silver_medals+"--->"+bronze_medals);
			
		}
	}
}
