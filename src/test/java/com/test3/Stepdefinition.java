package com.test3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdefinition {
	public static WebDriver driver;
	
	@Given("User launch Adactin Web Application")
	public void user_launch_Adactin_Web_Application() {
		 WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
		   driver.get("http://adactinhotelapp.com/");
	}

	@When("User enter valid {string} and {string}")
	public void user_enter_valid_and(String string, String string2) {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys(string);
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(string2); 
	}

	@When("User clicks login Button")
	public void user_clicks_login_Button() {
		WebElement lgnbtn = driver.findElement(By.id("login"));
		lgnbtn.click();
	}

	@Then("Search hotel Page is displayed")
	public void search_hotel_Page_is_displayed() {
		String currentUrl = driver.getCurrentUrl();
		   currentUrl.contains("Select Hotel");
		   System.out.println(currentUrl);
	}

	@Then("verify error msg is displayed")
	public void verify_error_msg_is_displayed() {
	    System.out.println("Invalid username and password");
	}

	@Then("User verify seach hotel page is displayed")
	public void user_verify_seach_hotel_page_is_displayed() {
	    String searchurl = driver.getCurrentUrl();
	boolean contains1 = searchurl.contains("SearchHotel");
	System.out.println(contains1);
	}

	@When("User Selects the {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_Selects_the(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) throws AWTException {
		WebElement loc = driver.findElement(By.id("location"));
		Select s=new Select(loc);
		s.selectByVisibleText(string);
		

		  WebElement hotel = driver.findElement(By.id("hotels"));
		Select select1=new Select(hotel);
		select1.selectByVisibleText(string2);

		WebElement room = driver.findElement(By.id("room_type"));
		Select select2=new Select(room);
		select2.selectByVisibleText(string3);
		
		
		WebElement roomno = driver.findElement(By.id("room_nos"));
		Select select3=new Select(roomno);
		select3.selectByVisibleText(string4);
		
		WebElement datein = driver.findElement(By.name("datepick_in"));
		datein.sendKeys(string5);
		
		WebElement dateout = driver.findElement(By.name("datepick_out"));
		dateout.sendKeys(string6);
		
		WebElement adults = driver.findElement(By.id("adult_room"));
		Select select6=new Select(adults);
		select6.selectByVisibleText(string7);
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
	}
	

	@When("User clicks Search Button")
	public void user_clicks_Search_Button() {
		WebElement search = driver.findElement(By.id("Submit"));
		search.click();
	}
	@Then("User select hotel page is displayed")
	public void user_select_hotel_page_is_displayed() {
	    System.out.println("select hotel page is dispalyed");
	}
	@When("User select hotel by clicking the radio Button and continue Button")
	public void user_select_hotel_by_clicking_the_radio_Button_and_continue_Button() {
		driver.findElement(By.id("radiobutton_0")).click();
		  driver.findElement(By.id("continue")).click();
	}

	@Then("Book hotel page is displayed")
	public void book_hotel_page_is_displayed() {
		String Url = driver.getCurrentUrl();
		boolean contains1 = Url.contains("BookHotel");
		System.out.println(contains1);
	}

	@When("User enters the valid {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_enters_the_valid(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) throws AWTException {
		WebElement Fn = driver.findElement(By.xpath("//input[@id='first_name']"));
		Fn.sendKeys(string);


		WebElement ln = driver.findElement(By.xpath("//input[@id='last_name']"));
		ln.sendKeys(string2);

		WebElement address = driver.findElement(By.name("address"));
		address.sendKeys(string3);

		WebElement creditc = driver.findElement(By.name("cc_num"));
		creditc.sendKeys(string4);

		WebElement credtype = driver.findElement(By.id("cc_type"));
		Select select5=new Select(credtype);
		select5.selectByVisibleText(string5);

		WebElement expmonth = driver.findElement(By.id("cc_exp_month"));
		Select select6=new Select(expmonth);
		select6.selectByVisibleText(string6);

		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);


		WebElement cvv = driver.findElement(By.name("cc_cvv"));
		cvv.sendKeys(string8);

	}

	@When("User clicks BookNow Button")
	public void user_clicks_BookNow_Button() throws InterruptedException {
		WebElement book = driver.findElement(By.name("book_now"));
		book.click();
		
		Thread.sleep(7000);
	}

	@Then("User Booking confirmation page is displayed")
	public void user_Booking_confirmation_page_is_displayed() {
	   String currentUrl2 = driver.getCurrentUrl();
	boolean contains2 = currentUrl2.contains("BookingConfirm");
	System.out.println("Booking confirmation page is displayed"+ contains2);
	}

	@Then("User prints orderid")
	public void user_prints_orderid() {
		WebElement ordid = driver.findElement(By.xpath("//input[@name='order_no']"));
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		Object orderid = executor.executeScript("return arguments[0].getAttribute('value')", ordid);
		System.out.println(orderid);
	}




	}



