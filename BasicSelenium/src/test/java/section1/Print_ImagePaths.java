package section1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_ImagePaths  {
	File f=new File("E://java//BrokenlinksOnOrangeHRM.txt");
	File f1=new File("E://java//imagePathsOnOrangePaths.txt");
	FileOutputStream fout1;
	FileOutputStream fout;
	WebDriver driver;
	public void Access_the_app()
	{
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	public void login_app()
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		
	WebElement ele=driver.findElement(By.name("password"));
	ele.sendKeys("admin123");
	ele.submit();
		
	}
	public void print_Title_Url()
	{
		System.out.println("title of the webpage  :"+driver.getTitle());
		
		System.out.println("current url of the webpage  :"+driver.getCurrentUrl());
	}
	public void store_in_files() {
		try {
			fout=new FileOutputStream(f,true);
		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
		}
	}
	public void get_Broken_links() throws Exception
	{
		int count=0;
		List<WebElement> links=driver.findElements(By.tagName("a"));
		ArrayList<String> arrlist=new ArrayList<String>();
		
		for(WebElement r:links)
		{
			int StatusCode=0;
			String link=r.getAttribute("href");
			
			URL url=new URL(link);
			
			
			URLConnection urlconn=url.openConnection();
			
			HttpURLConnection httpConn=(HttpURLConnection)urlconn;
			
			StatusCode=httpConn.getResponseCode();
			if(StatusCode>=0)
			{ 
				arrlist.add(link+"   "+StatusCode);
				
					count++;
			}
			System.out.println(arrlist);
			
		}
		fout.flush();
		fout.close();
		System.out.println(count+"  done..");
	}
	public void get_image_path() throws Exception
	{
		int count=0;
		try {
			fout1=new FileOutputStream(f1,true);
		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
		}
		
		List<WebElement> paths=driver.findElements(By.tagName("img"));
		for(WebElement r:paths)
		{
			String path=r.getAttribute("src");
			byte[] b=path.getBytes();
			fout1.write(b);
			fout1.write('\n');
			count++;
		}
		fout1.flush();
		fout1.close();
		System.out.println(count+"  done.."  );
	}
	public static void main(String[] args) throws Throwable {
		Print_ImagePaths pi=new Print_ImagePaths();
		pi.Access_the_app();
		pi.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		pi.login_app();
		pi.print_Title_Url();
		pi.store_in_files();
		pi.get_Broken_links();
		pi.get_image_path();
		pi.driver.quit();
	}
}

