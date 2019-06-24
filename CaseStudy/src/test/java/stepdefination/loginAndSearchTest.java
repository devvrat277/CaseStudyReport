package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginAndSearchTest {
 // private static final CharSequence String = null;
WebDriver driver;
@Given("I want to choose sign in")
public void i_want_to_choose_sign_in() {
	System.setProperty("webdriver.chrome.driver","Resources\\chromedriver2.exe");
    driver=new ChromeDriver();//
 driver.manage().window().maximize();
 driver.get("http://10.232.237.143:443/TestMeApp/");
	 driver.findElement(By.linkText("SignIn")).click();
   
}

@When("I want to write a step with {string}")
public void i_want_to_write_a_step_with(String user) {
   driver.findElement(By.name("userName")).sendKeys(user);
}

@When("I want to give passwoord with {string}")
public void i_want_to_give_passwoord_with(String pass) {
	 driver.findElement(By.name("password")).sendKeys(pass);
}

@Then("user should be able to login")
public void user_should_be_able_to_login() {
   driver.findElement(By.name("Login")).click();
}
@Given("I want to search product")
public void i_want_to_search_product() {
   driver.findElement(By.linkText("Home")).click();
}

@When("I want to enter product name {string}")
public void i_want_to_enter_product_name(String product) {
	  driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys(product);
}

@Then("I am able to clcik on search")
public void i_am_able_to_clcik_on_search() {
	  driver.findElement(By.xpath("//input[contains(@value,'FIND DETAILS')]")).click();
}

}
