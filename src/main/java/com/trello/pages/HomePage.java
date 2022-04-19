package com.trello.pages;


import org.openqa.selenium.Point;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.trello.TestBase.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//button[@data-test-id='header-create-menu-button']")
	WebElement CreateBtn;
	
	@FindBy(xpath="//button[@data-test-id='header-create-board-button']")
	WebElement createBoard;
	
	@FindBy(xpath="//input[@data-test-id='create-board-title-input']")
	WebElement boardTitle;
	
	//@FindBy(xpath="//button[@data-test-id='create-board-submit-button']")
	@FindBy(xpath="//button[text()='Create']")
	WebElement createSubmit;
	
	@FindBy(xpath="//span[text()='Add a list']")
	WebElement AddListA;
	
	@FindBy(xpath="//input[@type='text']")
	WebElement listAtext;
	
	@FindBy(xpath="//input[@type='text']")
	WebElement listBtext;
	
	@FindBy(xpath="//input[@value='Add list']")
	WebElement AddList;
	
	@FindBy(xpath="//*[contains(@aria-label,'Cancel')]")
	WebElement Cancel;
	
	@FindBy(xpath="(//*[contains(@class,'icon-close')])[1]")
	WebElement closecard;
	
	//span[@class='icon-sm icon-add']//..//..//..//textarea[@aria-label='List A']
	
	@FindBy(xpath="//textarea[@aria-label='List A']/../..//a/span[text()='Add a card']")
	WebElement Addcard;
	
	@FindBy(xpath="//textarea[starts-with (@class,'list-card')]")
	WebElement TitleforCard;
	
	@FindBy(xpath="//textarea[@aria-label='List A']/../div[2]/a[@aria-label='List actions']")
	WebElement listActions;
	
	@FindBy(xpath="//a[text()='Move list…']")
	WebElement moveList;
	
	@FindBy(xpath="//select[@class='js-select-list-pos']")
	WebElement position;
	
	@FindBy(xpath="//input[@value='Move']")
	WebElement Movebtn;
	
	@FindBy(xpath="//textarea[@aria-label='List A']/../../div[2]/a")
	WebElement cardCordinate;
	
	@FindBy(xpath="//span[@title='Nirosha (nirosha1yadla)']")
	WebElement NNbtn;
	
	@FindBy(xpath="//button[@data-test-id='header-member-menu-logout']")
	WebElement logout;
	
	@FindBy(xpath="//*[@value='Add card']")
	WebElement inneraddCard;
	
	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void createBoard() throws InterruptedException {
		CreateBtn.click();
		Thread.sleep(100);
		createBoard.click();
		Thread.sleep(2000);
		boardTitle.sendKeys("sample6");
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		   js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		   Thread.sleep(1000);
		createSubmit.click();
		Thread.sleep(3000);
		
	}
  
	
	public void addListA() {
		//AddListA.click();
		listAtext.sendKeys("List A");
		AddList.click();
		
	}
	
	public void addListB() {
		listBtext.sendKeys("List B");
		AddList.click();
		Cancel.click();
		
	}
	
	public void addCard() throws InterruptedException {
		Addcard.click();
		Thread.sleep(500);
	}
	
	public void enterTitle() {
		TitleforCard.sendKeys("Card A");
		inneraddCard.click();
		closecard.click();
	}
	
	public void moveCard() throws InterruptedException {
		listActions.click();
		moveList.click();
		Select select=new Select(position);
		select.selectByIndex(1);
		Movebtn.click();
		Thread.sleep(1000);
		
	}
	
	public void getCoordinates() {
		
		Point point=cardCordinate.getLocation();
		int x=point.getX();
		System.out.println("X Coordinate" +x);
		
		int y=point.getY();
		System.out.println("Y Coordinate" +y);
		
	}
	
	public void logOut() {
		
		NNbtn.click();
		logout.click();
		
	}
}
