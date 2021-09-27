package testBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigFile {
	// this method will rturn an object which only belongs to COnfig Detail
	public static ConfigDetails readconfigdetails() {

		ConfigDetails configDetails = new ConfigDetails();

		String configPath = System.getProperty("user.dir") + "\\test.properties";

		FileInputStream inputStream = null;

		Properties prop = new Properties();

		try {
			inputStream = new FileInputStream(configPath);
		} catch (FileNotFoundException e) {

		}

		try {
			prop.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}

		configDetails.setBrowser(prop.getProperty("browser"));
		configDetails.setUrl(prop.getProperty("url"));
		configDetails.setUsername(prop.getProperty("username"));
		configDetails.setPassword(prop.getProperty("password"));
		
		return configDetails;
	}

}
