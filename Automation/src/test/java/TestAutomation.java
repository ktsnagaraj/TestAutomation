import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.itextpdf.text.DocumentException;

import POM.HomePage;
import io.cucumber.java.en.And;

public class TestAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dra Nallely Corona\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		PageFactory.initElements(driver, HomePage.class);
		Thread.sleep(2000);
		driver.get("https://juice-shop.herokuapp.com/");
		Thread.sleep(2000);
		HomePage.popUpDismiss.click();
		HomePage.account.click();
		driver.quit();
		System.out.println("Executed");
	}

}
