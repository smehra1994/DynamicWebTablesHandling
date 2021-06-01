//Scenario : in htmlWebTableHandling we know rows were 4 but tomorrow we can have n no of rows so we can make it generic


package HTMLTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericRowsWebTableHandling {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C://Users/sanka/Documents/ChromeDriverEXE/new/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//we can see from xpath only that all tr's are under tbody so i=2 i wont change as 1st is the fixed coln name so i'll
		//always start with 2 only but for i<=7 i can make it generic
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		int rowCount=rows.size();
		System.out.println("Total rows are :" + rowCount);
		
		String beforeXpath="//*[@id='customers']/tbody/tr[";
		String afterXpath="]/td[1]";
		
		for(int i=2;i<=rowCount;i++) {
			String actualXpath=beforeXpath+i+afterXpath;
			WebElement element=driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
			if(element.getText().equals("Centro comercial Moctezuma"))
			{
				System.out.println("Company is :" + element.getText());
				break;
			}
		}
	

		String beforeXpathContact="//*[@id='customers']/tbody/tr[";
		String afterXpathContact="]/td[2]";
		
		for(int i=2;i<=rowCount;i++) {
			String actualXpathContact=beforeXpathContact+i+afterXpathContact;
			WebElement element=driver.findElement(By.xpath(actualXpathContact));
			System.out.println(element.getText());
			if(element.getText().equals("Helen Bennett"))
			{
				System.out.println("Contact is :" + element.getText());
				break;
			}
		}
		

				String beforeXpathCountry="//*[@id='customers']/tbody/tr[";
				String afterXpathCountry="]/td[3]";
				
				for(int i=2;i<=rowCount;i++) {
					String actualXpathCountry=beforeXpathCountry+i+afterXpathCountry;
					WebElement element=driver.findElement(By.xpath(actualXpathCountry));
					System.out.println(element.getText());
					if(element.getText().equals("Italy"))
					{
						System.out.println("Country is :" + element.getText());
						break;
					}
				}

	}

}
