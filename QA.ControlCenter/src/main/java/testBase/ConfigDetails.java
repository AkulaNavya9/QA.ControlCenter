package testBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDetails {

	private String browser;
	private String url;
	private String username;
	private String password;


	
	public String getBrowser() {
		return browser;
	}

	public void setBrowser(String browser) {
		this.browser = browser;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPropertiesValue(String property) {
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
return prop.getProperty(property);

}
	
}
