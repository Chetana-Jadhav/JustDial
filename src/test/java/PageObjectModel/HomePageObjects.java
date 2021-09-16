package PageObjectModel;

import StepDefs.StepDef;
import Utils.BaseTest;
import Utils.TestContext;
import com.google.inject.AbstractModule;
import com.google.inject.Inject;
import com.google.inject.PrivateBinder;
import com.google.inject.Provides;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;
@Log4j2
public class HomePageObjects extends BaseTest {

    @Inject
    TestContext testContext;

    private By searchBox = By.xpath("//input[@id='srchbx']");
    private By searchIcon = By.xpath("//span[@id='srIconwpr']");
    private By searchResult = By.xpath("//span[@id='ncard0']");
    private By SearchSuggestionDropdown = By.xpath("//span[@id='sauto']");
    private By CustomerCare = By.xpath("//body/div[10]/a[2]");
    private By textbox = By.xpath("//input[@id='what']");
    private By autoSearch = By.xpath("//span[@id='sauto1']");

    public void user_enters_in_search_text_box(String SearchInput1) {
        testContext.getDriver().findElement(searchBox).sendKeys(SearchInput1);
        log.debug("Data entered in search box as : "+SearchInput1);
    }

    public void user_clicks_search_button() {
        testContext.getDriver().findElement(searchIcon).click();
        log.debug("Search button clicked");
    }

    public void user_is_able_to_see_search_result_related_to_restaurants() {
        Assert.assertEquals(testContext.getDriver().getTitle(), "Best Restaurants in Mumbai - Top Veg & Non Veg Restaurants - Order Food Online - Justdial");
        Assert.assertEquals(testContext.getDriver().findElement(searchResult).isDisplayed(), true);
        log.debug("Restaurant search result validated");
    }

    public void user_is_able_to_see_the_drop_down_under_search_text_box_with_all_the_items_with_text(String string) {
        WebDriverWait wait = new WebDriverWait(testContext.getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SearchSuggestionDropdown));

        List<WebElement> list = testContext.getDriver().findElements(SearchSuggestionDropdown);
        testContext.getScenario().log("Auto Suggest List ::" + list.size());
        for (int i = 0; i< list.size();i++) {
            Assert.assertEquals(list.get(i).getText().contains(string), true);
        }
        log.debug("Auto suggestions for search bar validated" );
        }
        public void user_clicks_on(String string){
            WebDriverWait wait1 =new WebDriverWait(testContext.getDriver(), 30);
            wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.partialLinkText(string)));
            testContext.getDriver().findElement(By.partialLinkText(string)).click();
            log.debug(string + "link clicked");
        }
        public void user_is_navigates_to_the_corresponding_link_related_to (String string){
            String title = testContext.getDriver().getTitle();
            Assert.assertEquals(title.contains(string),true);
            Assert.assertNotEquals(title, "Justdial - Local Search, Social, News, Videos, Shopping");
            log.debug("user navigated to "+string+ "page");
        }
        public void user_navigates_to_customer_care_page_by_clicking_on_customer_care_tab_at_the_right_mid_of_the_page
        () {
            testContext.getDriver().findElement(CustomerCare).click();
            log.debug("Customer care link clicked");
        }
        public void user_enter_in_the_text_box (String string){
            testContext.getDriver().findElement(textbox).sendKeys(string);
            log.debug("text entered in text box as :" +string);
        }
        public void user_is_able_to_see_the_drop_down_and_all_the_items_in_the_list_must_have_text_as (String string){
            List<WebElement> list1= testContext.getDriver().findElements(SearchSuggestionDropdown);
            for (int i = 0; i < list1.size(); i++) {
                Assert.assertTrue(list1.get(i).getText().contains(string), "Search result validation failed at instance [ + i + ].");
            }
            log.debug("Auto suggestion validated for text box");
        }
    }
