package testNG;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class OrangeHRM_testNG {
	private static WebDriver driver = null;
	//Login 
  @Test
  public void login() {
	  System.setProperty("webdriver.chrome.driver", "C:\\pooja\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);		
		driver.findElement(By.xpath("//div/input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
 }
  //Apply leave
  @Test
  public void hrmleave() {
	  System.setProperty("webdriver.chrome.driver", "C:\\pooja\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
	    driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.linkText("Leave")).click();
		driver.findElement(By.linkText("Apply")).click();
		driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']/div[2]/i")).click();
	    driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();
		driver.findElement(By.xpath("//div[@class='oxd-date-input']/input")).sendKeys("2022-02-09");
	    driver.findElement(By.xpath("//textarea")).sendKeys("Personal leave");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();  
  }
  // Method overload for search function
  @Test(dataProvider = "SearchByUsername" )
	 public void search(String username){
	  	System.setProperty("webdriver.chrome.driver", "C:\\pooja\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);		
		driver.findElement(By.xpath("//div/input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//a/span")).click(); 
		driver.findElement(By.xpath("//form//div[2]//input")).sendKeys(username);
		driver.findElement(By.xpath("//form//div//button[2]")).click();
	
	 }	

  @Test(dataProvider = "SearchByUsernameEmpName" )
	public void search(String username, String empName) {
	  System.setProperty("webdriver.chrome.driver", "C:\\pooja\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);		
		driver.findElement(By.xpath("//div/input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//a/span")).click();
		driver.findElement(By.xpath("//form//div[2]//input")).sendKeys(username);
		driver.findElement(By.xpath("//div/div[2]/div/div/input")).sendKeys(empName);
		driver.findElement(By.xpath("//form//div//button[2]")).click();	
		
		 }
  @DataProvider(name = "SearchByUsernameEmpName")
  public static Object[][] dataProviderMethod()
  {
     return new Object[][] {{"Admin","Pooja"}};
  }
  @DataProvider(name = "SearchByUsername")
  public static Object[][] dataProviderMethod1()
  {
     return new Object[][] {{"Admin"}};
  }
  
}