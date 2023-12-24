package section1;

import java.util.Iterator;
import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class find_Images_in_webPage {
	WebDriver driver;
	public void count_images()
	{
		driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		
	}
	public void count_links()
	{
		
		List<WebElement> e=driver.findElements(By.tagName("img"));
		int count=0;
		for(WebElement r:e)
		{
			String s=r.getAttribute("src");
			
			System.out.println(s+'\n');
			count++;
		}
		System.out.println(count);
//		int count=0;
//		Iterator q=e.iterator();
//		while (q.hasNext()) {
//			String s=(String)q.next();
//			System.out.println(s);
//		}
	}
	public static void main(String[] args) {
		find_Images_in_webPage f=new find_Images_in_webPage();
		
		
		
		f.count_images();
		f.count_links();
	}
}
