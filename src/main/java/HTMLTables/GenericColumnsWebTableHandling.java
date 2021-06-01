package HTMLTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericColumnsWebTableHandling {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Users/sanka/Documents/ChromeDriverEXE/new/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//handle columns
		//*[@id="customers"]/tbody/tr[1]/th[1]
		//*[@id="customers"]/tbody/tr[1]/th[2]
		//*[@id="customers"]/tbody/tr[1]/th[3]
		
		List<WebElement> colns=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th"));
		int colnSize=colns.size();
		System.out.println("Colns count is :" + colnSize);
		
		String beforecolnxpath="//*[@id='customers']/tbody/tr[1]/th[";
		String aftercolnXpath="]";
		
		for(int i=1;i<=colnSize;i++) {
			String actualcolnXpath=beforecolnxpath+i+aftercolnXpath;
			WebElement element=driver.findElement(By.xpath(actualcolnXpath));
			System.out.println(element.getText());
			if(element.getText().equals("Contact"))          //remove if condition if u want to print all coln names
			{
				System.out.println("Coln is :" + element.getText());
				break;
			}
		}
	
	}
}
