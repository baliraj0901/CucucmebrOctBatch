package com.nopCom.pageObejct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
 
	public WebDriver ldriver;

	public AddCustomerPage(WebDriver rdriver) {
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver,this);		
	}
	
	//web elements
By lnkCustomes_menu=By.xpath("//a[@href='#']//p[contains(text(),'Customers')]");

	
	
	By lnkCustomers_menu_item=By.xpath("//p[text()=' Customers']");
	
	By btnAddNew=By.xpath("//a[@class='btn btn-primary']");
	
	By txtEmail=By.xpath("//input[@id='Email']");
	
	By txtPassword=By.xpath("//input[@id='Password']");
	
	By txtFirstName=By.xpath("//input[@id='FirstName']");

	By txtLastName=By.xpath("//input[@id='LastName']");

	By rdMaleGender=By.id("Gender_Male");
	
	By rdFemaleGender=By.id("Gender_Female");
	
	By txtDob=By.xpath("//input[@id='DateOfBirth']");
	
	By txtCompanyName=By.xpath("//input[@id='Company']");

	By txtAdmitContent=By.xpath("//textarea[@id='AdminComment']");

	By btnSave=By.xpath("//button[@name='save']");
	
	//methods
	
		public String getPageTitle() {
			return ldriver.getTitle();
		}
		
		public void clickOnCustomesMenu() {
			ldriver.findElement(lnkCustomes_menu).click();
		}
		
		public void clickOnCustomesMenuItem() {
			ldriver.findElement(lnkCustomers_menu_item).click();
		}
		
		public void clickOnAddNew() {
			ldriver.findElement(btnAddNew).click();
		}
		
		public void SetEmail(String email) {
			ldriver.findElement(txtEmail).sendKeys(email);;
		}
		
		public void SetPassword(String password) {
			ldriver.findElement(txtPassword).sendKeys(password);;
		}
		
		public void SetFirstName(String fname) {
			ldriver.findElement(txtFirstName).sendKeys(fname);;
		}
		
		public void SetLastName(String lname) {
			ldriver.findElement(txtLastName).sendKeys(lname);;
		}
		
		public void SetGender(String gender) {
			if(gender.equals("Male")) {
				ldriver.findElement(rdMaleGender).click();
				
			}else {
				ldriver.findElement(rdFemaleGender).click();
			}
		}
		
		public void SetCompanyName(String comName) {
			ldriver.findElement(txtCompanyName).sendKeys(comName);;
		}
		
		public void SetAdminContent(String content) {
			ldriver.findElement(txtAdmitContent).sendKeys(content);;
		}
		
		public void clickOnSave() {
			ldriver.findElement(btnSave).click();
		}
}
