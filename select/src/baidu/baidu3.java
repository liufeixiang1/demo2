package baidu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class baidu3 extends baidu2{
	public static WebElement a;
	public static WebElement b;
	public void yuansu() {
		 a=driver.findElement(By.id("kw"));
		 b=driver.findElement(By.id("su"));
	}
}
