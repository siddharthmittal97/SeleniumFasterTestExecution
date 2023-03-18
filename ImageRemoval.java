import java.util.HashMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class ImageRemoval 
{
public static void main(String args[])
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");    	
    	ChromeOptions options = new ChromeOptions();
    	options.addArguments ("--remote-allow-origins=*");
    	disable(options);
    	WebDriver driver = new ChromeDriver(options);
    	driver.get("https://www.mirketa.com");
    }

	public static ChromeOptions disable(ChromeOptions options)
	{
    	HashMap<String, Object> imagesMap = new HashMap<String, Object>();
    	imagesMap.put("images", 2);
    	HashMap<String, Object> prefsMap = new HashMap<String, Object>();
    	prefsMap.put("profile.default_content_setting_values", imagesMap);
    	options.setExperimentalOption("prefs", prefsMap);
    	return options;
	}
 }
