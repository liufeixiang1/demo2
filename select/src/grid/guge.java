package grid;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class guge {
	public static void main(String[] args) throws IOException, InterruptedException{
		WebDriver driver;
		ChromeOptions options=new ChromeOptions();
		options.addArguments("C:\\Program Files (x86)\\Google\\Chrome\\Application");
		DesiredCapabilities capabilities=DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver=new RemoteWebDriver(new URL("http://localhost:5555/wd/hub"),capabilities);
		Thread.sleep(5000);
		driver.get("http://www.baidu.com");
	}
}
