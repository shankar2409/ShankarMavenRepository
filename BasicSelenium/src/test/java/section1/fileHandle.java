package section1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileHandle {

//	public void facebook()
//	{
//	// open the browser
//
//	// access the link using iterator
////		Iterator<WebElement> s1=allLinks.iterator();
////		while(s1.hasNext())
////		{
////		System.out.println(	s1.next());
////		}
////		
	public static void main(String[] args) throws Throwable {
		File f=new File("E://java//selenium.txt");
		FileOutputStream fout=new FileOutputStream(f,true);
		WebDriver driver = new ChromeDriver();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// access the application
		driver.get("https://www.amazon.in/");

		// fetch the links
		List<WebElement> allLinks = driver.findElements(By.tagName("img"));

		// accessing all the links one by one
		Thread.sleep(2000);
		int count = 0;
		for (WebElement r : allLinks) {
		
			String link = r.getAttribute("src");
			if(link!=null)
			{
				byte[] b=link.getBytes();
				fout.write(b);
				fout.write('\n');
				count++;
			}
		}
		fout.flush();
		fout.close();
		System.out.println(count);
		
	}
}
