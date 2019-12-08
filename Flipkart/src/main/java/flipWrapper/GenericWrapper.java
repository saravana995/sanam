package flipWrapper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GenericWrapper implements Wrapper {
	public Properties cprop;
	public Properties prop;
	public RemoteWebDriver driver;
	public String URL;
	
	public GenericWrapper()
	{
		cprop= new Properties();
		try {
		cprop.load(new FileInputStream(new File("./src/test/java/cprop.properties")));
			
		 URL = cprop.getProperty("UR");
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void loadObject()
	{
		prop = new Properties();
		try {
			prop.load(new FileInputStream(new File("./src/test/java/prop.properties")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void invokeApp(String Browser)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		
	}
	
	public void enterById(String Id, String Data) {
		// TODO Auto-generated method stub
		
	}

	public void enterByName(String Name, String Data) {
		// TODO Auto-generated method stub
		
	}

	public void enterByXpath(String Xpath, String Data) {
		// TODO Auto-generated method stub
		
	}

}
