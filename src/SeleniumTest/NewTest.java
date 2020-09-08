package SeleniumTest;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	private WebDriver driver;
	
  @Test
  public void f() {
	  WebElement cuadroBusqueda = driver.findElement(By.name("q"));
	  cuadroBusqueda.sendKeys("Ingresar");
	  cuadroBusqueda.click();
	  cuadroBusqueda.submit();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  assertEquals("Ingresar", driver.getTitle());
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\\\descargas\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://localhost:8080/Evaluacion2/");
  }

  @AfterTest
  public void afterTest() {
  }

}
