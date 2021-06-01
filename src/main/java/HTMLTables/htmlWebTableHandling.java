//Scenario : Fetch specific values of rows(tr) from HTML webtables from all 3 columns(td)

package HTMLTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class htmlWebTableHandling {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C://Users/sanka/Documents/ChromeDriverEXE/new/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//inspect all the values in under colums and right click and copy xpath and paste here
		
		//for Company column
		//*[@id="customers"]/tbody/tr[2]/td[1]  //1st value
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]
		//*[@id="customers"]/tbody/tr[7]/td[1]  //last value
		//divide xpath
		String beforeXpath="//*[@id='customers']/tbody/tr[";
		String afterXpath="]/td[1]";
		
		for(int i=2;i<=7;i++) {
			String actualXpath=beforeXpath+i+afterXpath;
			WebElement element=driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
			if(element.getText().equals("Centro comercial Moctezuma"))
			{
				System.out.println("Company is :" + element.getText());
				break;
			}
		}
		
		
		//for Contact column
		//*[@id="customers"]/tbody/tr[2]/td[2]
		//*[@id="customers"]/tbody/tr[5]/td[2]
		String beforeXpathContact="//*[@id='customers']/tbody/tr[";
		String afterXpathContact="]/td[2]";
		
		for(int i=2;i<=7;i++) {
			String actualXpathContact=beforeXpathContact+i+afterXpathContact;
			WebElement element=driver.findElement(By.xpath(actualXpathContact));
			System.out.println(element.getText());
			if(element.getText().equals("Helen Bennett"))
			{
				System.out.println("Contact is :" + element.getText());
				break;
			}
		}
		
		//for country column
				//*[@id="customers"]/tbody/tr[2]/td[3]
				//*[@id="customers"]/tbody/tr[5]/td[3]
				String beforeXpathCountry="//*[@id='customers']/tbody/tr[";
				String afterXpathCountry="]/td[3]";
				
				for(int i=2;i<=7;i++) {
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
