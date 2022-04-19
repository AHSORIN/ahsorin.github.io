package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.trello.TestBase.TestBase;
import com.trello.pages.SigninPage;
import com.trello.pages.HomePage;

public class TrelloTest extends TestBase {
	SigninPage SigninPage;
	HomePage HomePage;
	
	@BeforeTest
	public void setup() {
		
		initialization();
	 SigninPage=new SigninPage();
	
		
	}
	
	@Test(priority=1)
	public void loginTest() throws InterruptedException {
		
		HomePage=SigninPage.clickLoginIn();
		HomePage.createBoard();
		HomePage.addListA();
		HomePage.addListB();
		HomePage.addCard();
		HomePage.enterTitle();
		HomePage.addCard();
		HomePage.moveCard();
		HomePage.getCoordinates();
		
	}
	
	@Test(priority = 2)
	public void logout()
	{
		HomePage.logOut();
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
