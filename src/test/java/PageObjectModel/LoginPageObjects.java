package PageObjectModel;

import StepDefs.StepDef;
import Utils.BaseTest;
import Utils.TestContext;
import com.google.inject.AbstractModule;
import com.google.inject.Inject;
import com.google.inject.Provides;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;
@Log4j2
public class LoginPageObjects extends BaseTest {

    @Inject
    TestContext testContext;


    private By signup_link = By.xpath("//span[@id='h_sin_up']");
    private By name = By.xpath("//input[@id='lgn_name']");
    private By mobile = By.xpath("//input[@id='lgn_mob']");
    private By sendOTP = By.xpath("//button[@id='lgn_smtn']");
    private By message = By.xpath("//div[@class='otp-text wrapper pb-10']");
    private By login_link = By.xpath("//span[@id='h_login']");
    private By Error_msg = By.xpath("//div[@id='iup']");



    public void user_clicks_on_sign_up_link_at_the_top_right_corner_of_the_application() {
        testContext.getDriver().findElement(signup_link).click();
        log.debug("Sign Up link clicked");
    }

    public void user_enters_name_as_and_phone_number_as_and_clicks_on_submit_button(String string, String string2) {
        Set<String> handles = testContext.getDriver().getWindowHandles();
        Iterator<String> it = handles.iterator();
        String childWindowId = it.next();
        testContext.getDriver().switchTo().window(childWindowId);
        testContext.getDriver().findElement(name).sendKeys(string);
        log.debug("Name entered as :" +string);
        testContext.getDriver().findElement(mobile).sendKeys(string2);
        log.debug("Mobile No. entered as : "+string2);
        testContext.getDriver().findElement(sendOTP).click();
        log.debug("Send OTP button clicked");

    }
    public void user_is_displayed_with_the_message_as(String string) {
        Assert.assertEquals(testContext.getDriver().findElement(message), string);
        boolean msg = testContext.getDriver().findElement(message).isDisplayed();
        Assert.assertEquals(msg,true);
        log.debug(string + "message displayed");
    }
    public void user_clicks_on_login_in_link_at_the_top_right_corner_of_the_application() {
        testContext.getDriver().findElement(login_link).click();
        log.debug("Login link clicked");
    }
    public void user_enters_name_as_and_phone_number_as_and_clicks_on_send_otp_button(String string, String string2) {
        Set<String> handles = testContext.getDriver().getWindowHandles();
        Iterator<String> it = handles.iterator();
        String childWindowId = it.next();
        testContext.getDriver().switchTo().window(childWindowId);
        testContext.getDriver().findElement(name).sendKeys(string);
        log.debug("Name entered as :" +string);
        testContext.getDriver().findElement(mobile).sendKeys(string2);
        log.debug("Mobile No. entered as : "+string2);
        testContext.getDriver().findElement(sendOTP).click();
        log.debug("Send OTP button clicked");
    }
    public void user_gets_error_message_as(String msg) {
        WebElement Message =  testContext.getDriver().findElement(Error_msg);
        testContext.getScenario().log("Message is given as : "+Message);
        log.debug("Message is given as : "+msg);
        Assert.assertEquals(Message, msg);
        boolean errorMsg = testContext.getDriver().findElement(Error_msg).isDisplayed();
        Assert.assertEquals(errorMsg, true);
        log.debug("Error message validated");

    }
    public void user_do_not_enter_any_name_and_phone_number_but_clicks_on_submit_button() {
        Set<String> handles = testContext.getDriver().getWindowHandles();
        Iterator<String> it = handles.iterator();
        String childWindowId = it.next();
        testContext.getDriver().switchTo().window(childWindowId);
        testContext.getDriver().findElement(sendOTP).click();
        log.debug("Send OTP button clicked");
    }
    public void user_is_able_to_enter_only_digits_in_the_mobile_text_field(String string) {
       String MaxMobileNoLength = testContext.getDriver().findElement(mobile).getAttribute("maxlength");
        Assert.assertEquals(MaxMobileNoLength,string);
        log.debug("Mobile no. field validated");

    }
}
