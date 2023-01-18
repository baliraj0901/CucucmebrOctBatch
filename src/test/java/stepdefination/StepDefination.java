package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.nopCom.pageObejct.AddCustomerPage;
import com.nopCom.pageObejct.AdminPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination extends Base {

	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser() throws Exception {
	    System.setProperty("webdriver.chrome.driver","D:\\QE11_Software\\chromedriver_108\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	    Thread.sleep(2000);
        ad=new AdminPage(driver);
	}

	@When("User open url {string}")
	public void user_open_url(String url) throws Exception {
	  driver.get(url);
	  driver.manage().window().maximize();
	    Thread.sleep(2000);

	}

	@When("User enter Email as {string} and password as {string}")
	public void user_enter_email_as_and_password_as(String email, String password) throws Exception {
	   ad.setUserName(email);
	   ad.setPassword(password);
	    Thread.sleep(2000);

	}

	@When("Click on Login")
	public void click_on_login() {
	  ad.clickLogin();
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String title) throws Exception {
	    Assert.assertEquals(title, driver.getTitle());
	    Thread.sleep(2000);
	}
	
	@Then("close browser")
	public void close_browser() throws Exception {
	    driver.close();
	    Thread.sleep(2000);

	}
	
	//add new customer
	@Then("User can view Dashboard")
	public void user_can_view_dashboard() throws Exception {
	   addCust=new AddCustomerPage(driver);
	   Assert.assertEquals("Dashboard / nopCommerce administration",addCust.getPageTitle());
	    Thread.sleep(2000);

	}

	@When("user click on customers menu")
	public void user_click_on_customers_menu() throws Exception {
	 addCust.clickOnCustomesMenu();
	    Thread.sleep(2000);

	}

	@When("User click on customers menu item")
	public void user_click_on_customers_menu_item() throws Exception {
	   addCust.clickOnCustomesMenuItem();
	    Thread.sleep(2000);

	}

	@When("User click on new add button")
	public void user_click_on_new_add_button() throws Exception {
	   addCust.clickOnAddNew();
	    Thread.sleep(2000);

	}

	@Then("User can view add new customer page")
	public void user_can_view_add_new_customer_page() throws Exception {
	    Thread.sleep(2000);
       Assert.assertEquals("Add a new customer / nopCommerce administration", addCust.getPageTitle());
	}

	@When("user enter customer info as {string} and {string} and {string} and {string} and {string} and {string} and {string}")
	public void user_enter_customer_info_as_and_and_and_and_and_and(String newEmail, String NewPassword, String firstName, String lastName, String gender, String compName, String adminComment) throws Exception {
	  addCust.SetEmail(newEmail);
	  addCust.SetPassword(NewPassword);
	  addCust.SetFirstName(firstName);
	  addCust.SetLastName(lastName);
	  addCust.SetGender(gender);
	  addCust.SetCompanyName(compName);
	  addCust.SetAdminContent(adminComment);
	    Thread.sleep(2000);

	}

	@When("user click on save button")
	public void user_click_on_save_button() {
	   addCust.clickOnSave();
	}

	@Then("User can view confirmation msg {string}")
	public void user_can_view_confirmation_msg(String string) throws Exception {
	   Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("The new customer has been added successfully."));
	    Thread.sleep(2000);

	   
	}
}
