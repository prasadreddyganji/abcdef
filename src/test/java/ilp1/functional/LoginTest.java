package ilp1.functional;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class LoginTest {
	@Test
	public void testTtile() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","/home/ch20184402/Training/ILP1/geckodriver");
		FirefoxOptions opts = new FirefoxOptions();
		opts.setHeadless(true);
		WebDriver driver = new FirefoxDriver(opts);
		String baseUrl = "http://localhost:5050/b31-bookstore-testing/index.jsp";
		driver.get(baseUrl);
		assertEquals("Book Store - ILP1", driver.getTitle());
		driver.close();
		
	}
	
	@Test
	public void testLoginForm() {
		System.setProperty("webdriver.gecko.driver","/home/ch20184402/Training/ILP1/geckodriver");
		FirefoxOptions opts = new FirefoxOptions();
		opts.setHeadless(true);
		WebDriver driver = new FirefoxDriver(opts);
		String baseUrl = "http://localhost:5050/b31-bookstore-testing/index.jsp";
		driver.get(baseUrl);
		assertEquals("input", driver.findElement(By.id("email")).getTagName());
		assertEquals("input", driver.findElement(By.id("psw")).getTagName());
		driver.close();
	}

}
