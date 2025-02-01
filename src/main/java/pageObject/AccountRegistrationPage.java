package pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{
	WebDriver driver;
	
	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement txtFirstname;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement txtLastname;
					
    @FindBy(xpath="//input[@id='input-email']")
    WebElement txtEmail;
    
    
    @FindBy(xpath="//input[@id='input-password']")
    WebElement txtPassword;
    
    @FindBy(xpath="//input[@id='input-newsletter']")  
    WebElement chkdSubscribe;
    
    @FindBy(xpath="//input[@name='agree']")  
    WebElement chkdPolicy;
    
    @FindBy(xpath="//button[normalize-space()='Continue']")
    WebElement btnContinue;
    
    @FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
    WebElement msgConfirmation;
    
    
    public void setFirstName(String fname) {
    	txtFirstname.sendKeys(fname);
    }
    
    public void setLastName(String lname) {
    	txtLastname.sendKeys(lname);
    }
    
    public void setEmail(String email) {
    	txtEmail.sendKeys(email);
    }
    
    public void setPassword(String pwd) {
    	txtPassword.sendKeys(pwd);
    }
    
    public void setSubscribe() {
    	chkdSubscribe.click();
    
    }
    
    
    public void setPrivacyPolicy() {
    	chkdPolicy.click();
    }
    
    public void clickContinue() {
    	btnContinue.click();
    	
    	//solution 2
    	//btnContinue.submit();
    	
    	//solution 3
//    	Actions act=new Actions(driver);
//    	act.moveToElement(btnContinue).click().perform();
//    	
    	//solution 4
    	//JavascriptExecution js=(JavascriptExecutor)driver;
    	//js.executeScript("arguments[0].click();", btnContinue);
    	
    	//solution 5
    	//btnContinue.sendkeys(keys.RETURN);
    	
    	//solution 6
    	//WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	//mywait.until(ExpectedConditions.elementToClickable(btnContinue)).click();
    }
    
    public String getConfirmationMsg() {
    	try {
    	return (msgConfirmation.getText());
    	}catch (Exception e) {
    	return (e.getMessage());
    }
    	
   }
    
}
