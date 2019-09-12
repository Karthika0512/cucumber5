package com.fb.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddTariff {
	WebDriver d;
	@Given("user launch the browser")
	public void user_launch_the_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Uer\\eclipse-workspace---Karthi1234\\Cucumber5\\Driver\\chromedriver.exe");
		d = new ChromeDriver();	
		d.get("http://demo.guru99.com/telecom/");
	    }

	@When("user enter {String},{String},{String},{String},{String},{String},{String} fields")
	public void user_enter_fields(String mrental,String lmin,String Imin,String spack,String lpermin,String Ipermincharge,String smscharge) {
		d.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
		d.findElement(By.id("rental1")).sendKeys(mrental);
		d.findElement(By.id("local_minutes")).sendKeys(lmin);
		d.findElement(By.id("inter_minutes")).sendKeys(Imin);
		d.findElement(By.id("sms_pack")).sendKeys(spack);
		d.findElement(By.id("minutes_charges")).sendKeys(lpermin);
		d.findElement(By.id("inter_charges")).sendKeys(Ipermincharge);
		d.findElement(By.id("sms_charges")).sendKeys(smscharge);
		d.findElement(By.xpath("//input[@name='submit']")).click();
		
	    }

	@Then("verify id is displayed or not")
	public void verify_id_is_displayed_or_not() {
		String s=d.getCurrentUrl();
		boolean b=s.contains("customer");
		System.out.println(b);
		Assert.assertTrue(b);
	  }


}
