package testBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigFile {
	private static ConfigDetails configDetails;

	// this method will return an object which only belongs to COnfig Detail
	public static ConfigDetails readconfigdetails() {

		 ConfigDetails configDetails = getSingletonConfigDetails();

		String configPath = System.getProperty("user.dir") + "\\test.properties";
		System.out.println(configPath + "this is config path");
		FileInputStream inputStream = null;

		Properties prop = new Properties();

		try {
			inputStream = new FileInputStream(configPath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			prop.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}

		configDetails.setBrowser(prop.getProperty("browser"));
		configDetails.setUrl(prop.getProperty("url"));
		configDetails.setUsername(prop.getProperty("username"));
		System.out.println(prop.getProperty("username"));
		System.out.println(configDetails.getUsername());
		configDetails.setPassword(prop.getProperty("password"));

		return configDetails;
	}
	


	public static ConfigDetails getSingletonConfigDetails() {

		if (configDetails == null) {
			synchronized (ConfigDetails.class) {
				if (configDetails == null) {
					configDetails = new ConfigDetails();// instance will be created at request time
				}
			}
		}
		return configDetails;
	}

}
