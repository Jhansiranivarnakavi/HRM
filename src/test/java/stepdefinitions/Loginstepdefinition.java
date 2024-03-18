package stepdefinitions;

import apppages.loginpage;
import drivers.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class Loginstepdefinition {
    public WebDriver driver;
     loginpage login = new loginpage(DriverManager.getDriver());

    @When("User launches the application")
    public void User_launches_the_application() throws InterruptedException {
        DriverManager.getDriver().get("http://183.82.103.245/nareshit/login.php");
        Thread.sleep(3000);
    }
    @When("User Enters {string} and {string}")
    public void user_enters_and(String username , String password) {
      login.enterusernameandpassword("nareshit","nareshit");
    }

    @Then("User click on login button")
    public void user_click_on_login_button() {
     login.loginbutton();
    }
    @Then("Page title should be {string}")
    public void page_title_should_be(String string) {

    }
}
