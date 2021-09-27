package testBase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Base {

	private static WebDriver driver;
	public static String browserType = null;
	public static String configPath = null;
	public static ConfigDetails configDtls = null;
	public static String appURL = null;

	@BeforeSuite
	public void initializeSuite() {
		System.out.println("Initialized Suite");
		try {
			// Reading the Config details info
			configDtls = ReadConfigFile.readconfigdetails();
			browserType = configDtls.getBrowser();
			appURL = configDtls.getUrl();
		} catch (Exception e) {
			// logger.error("Error in initializeSuite Method: ", e.getMessage());
			System.out.println(e.getMessage());
		}
	}

	@BeforeMethod
	public void initDriver() {
		System.out.println("Initialized Driver");
		try {
			String browser = configDtls.getBrowser();
			switch (browser.toLowerCase()) {
			case "chrome":
				initChromeDriver(appURL);
				break;
//			case "firefox":
//				initFirefoxDriver(appURL);
//				break;
//			case "ie":
//				initIEDriver(appURL);
//				break;
//			case "headless":
//				// initPhantomDriver(appURL);
//				break;
		}
			
			
			
		} catch (Exception e) {
			//logger.error("Error in initDriver Method: ", e.getMessage());
			e.printStackTrace();
		}
	}
	private void initChromeDriver(String appURL) {
		//logger.info("Launching Google Chrome browser......");
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		setDriver(new ChromeDriver());
		getDriver().manage().window().maximize();
		getDriver().get(appURL);
		//driver.manage().timeouts().implicitlyWait(null);
		//logger.info("Launched URL : " + appURL);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		Base.driver = driver;
	}
}
