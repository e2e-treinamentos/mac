package teste;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimeiroTeste {
	
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.google.com.br");
		
	}

	@After
	public void tearDown() throws Exception {
		
		System.out.println(" habilit");
	}

	@Test
	public void test() {
		fail("Not yet implemented");
		
		System.out.println();
	}

}
