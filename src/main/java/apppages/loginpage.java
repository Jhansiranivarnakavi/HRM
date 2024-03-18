package apppages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
    public WebDriver driver;
    public loginpage(WebDriver driver){
      this.driver= driver;
    }

private By Username_Text =By.name("txtUserName");
private By Password_Text = By.name("txtPassword");
private By but_login = By.name("Submit");




public void enterusernameandpassword(String Username,String password){
    driver.findElement(Username_Text).sendKeys(Username);
    driver.findElement(Password_Text).sendKeys(password);

}

public void loginbutton(){
    driver.findElement(but_login).click();
}


}
