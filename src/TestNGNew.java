import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGNew {
	
	 public String baseUrl = "https://www.phptravels.net/admin";
	    String driverPath = "E:\\Selenium\\Chromedriver.exe";
	    public WebDriver driver ;
	    
	    
  @Test 
  public void LoadUrl() {
	  
      System.setProperty("webdriver.chrome.driver", driverPath);
      driver = new ChromeDriver();
      driver.get(baseUrl);
      String expectedTitle = "Administator Login";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
 
  }
  
  @Test
  public void Login() {
	  
      driver.findElement(By.xpath("/html/body/div[1]/form[1]/div[1]/input[1]")).sendKeys("admin@phptravels.com");
      driver.findElement(By.xpath("/html/body/div[1]/form[1]/div[1]/input[2]")).sendKeys("demoadmin");
      driver.findElement(By.xpath("/html/body/div[1]/form[1]/button")).click();
      String expectedTitle = "Dashboard";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
      driver.close();
  }
}
