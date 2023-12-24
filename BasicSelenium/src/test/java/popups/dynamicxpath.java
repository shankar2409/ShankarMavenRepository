package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

////td[text()='Malawi']/parent::tr/child::td[2]
//table/tbody/tr/td[text()='Malta']/parent::tr/child::td[2]



//javascriptexecter for if tags are present in the shadowroot


/*
 * open the browser 
 * url:books-pwakit.appspot
 */


//document.querySelector("[apptitle='BOOKS']").shadowRoot.querySelector("[effects='waterfall'] app-toolbar[class='toolbar-bottom']>book-input-decorator").shadowRoot.querySelector("[class='decorator'] [name='input']").value="dfghjk"
public class dynamicxpath {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/shadow?sublist=0");
	}
}
