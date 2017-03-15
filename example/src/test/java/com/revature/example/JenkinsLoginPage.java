package com.revature.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Page object model
// 	decouple test case scenarios from the Selenium logic
public class JenkinsLoginPage{
	
	// field selectors
	private final String USERNAME_ID = "j_username";
	private final String PASSWORD_XPATH = "//*[@id=\"main-panel\"]/div/form/table/tbody/tr[2]/td[2]/input";
	private final String LOGIN_ID = "yui-gen1-button";
	private final String URL = "http://54.202.147.251:8080/jenkins/";
	
	private WebDriver driver;
	
	public JenkinsLoginPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void gotoPage(){
		driver.get(URL);
	}
	
	public void setUsername(String username){
		driver.findElement(By.id(USERNAME_ID)).sendKeys(username);
	}
	
	public void setPassword(String password){
		driver.findElement(By.xpath(PASSWORD_XPATH)).sendKeys(password);
	}
	
	public void login(){
		driver.findElement(By.id(LOGIN_ID)).click();
	}
	
}

