package com.fb.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddTariff {
	WebDriver d;
	@Given("user launch the browser")
	public void user_launch_the_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Uer\\eclipse-workspace---Karthi1234\\Cucumber5\\Driver\\chromedriver.exe");
		d = new ChromeDriver();	
		d.get("http://demo.guru99.com/telecom/");
	    }

	@When("user enter all fields")
	public void user_enter_all_fields(DataTable data) {
		List<Map<String, String>> da = data.asMaps();
		d.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
		d.findElement(By.id("rental1")).sendKeys(da.get(0).get("mrental"));
		d.findElement(By.id("local_minutes")).sendKeys(da.get(0).get("lmin"));
		d.findElement(By.id("inter_minutes")).sendKeys(da.get(0).get("Imin"));
		d.findElement(By.id("sms_pack")).sendKeys(da.get(0).get("spack"));
		d.findElement(By.id("minutes_charges")).sendKeys(da.get(0).get("lpermin"));
		d.findElement(By.id("inter_charges")).sendKeys(da.get(0).get("Ipermincharge"));
		d.findElement(By.id("sms_charges")).sendKeys(da.get(0).get("smscharge"));
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
