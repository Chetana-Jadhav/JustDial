package StepDefs;

import PageObjectModel.HomePageObjects;
import PageObjectModel.LoginPageObjects;
import Utils.BaseTest;
import Utils.TestContext;
import com.google.inject.AbstractModule;
import com.google.inject.Inject;
import com.google.inject.Provides;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class StepDef extends BaseTest {

    @Inject
   TestContext testContext;

    @Inject
    LoginPageObjects loginPageObjects;

    @Inject
    HomePageObjects homePageObjects;


    @Given("User navigates to the application url {string}")
    public void user_navigates_to_the_application_url(String url) {
        testContext.getDriver().get(url);
    }

    @When("User clicks on Sign up link at the top right corner of the application")
    public void user_clicks_on_sign_up_link_at_the_top_right_corner_of_the_application() {
        loginPageObjects.user_clicks_on_sign_up_link_at_the_top_right_corner_of_the_application();
    }

    @When("User enters name as {string} and Phone number as {string} and clicks on Submit Button")
    public void user_enters_name_as_and_phone_number_as_and_clicks_on_submit_button(String string, String string2) {
        loginPageObjects.user_enters_name_as_and_phone_number_as_and_clicks_on_submit_button(string, string2);
    }

    @Then("User is displayed with the message as {string}")
    public void user_is_displayed_with_the_message_as(String string) {
        loginPageObjects.user_is_displayed_with_the_message_as(string);
    }

    @When("User clicks on Login-in link at the top right corner of the application")
    public void user_clicks_on_login_in_link_at_the_top_right_corner_of_the_application() {
        loginPageObjects.user_clicks_on_login_in_link_at_the_top_right_corner_of_the_application();
    }

    @When("User enters name as {string} and Phone number as {string} and clicks on send OTP Button")
    public void user_enters_name_as_and_phone_number_as_and_clicks_on_send_otp_button(String string, String string2) {
        loginPageObjects.user_enters_name_as_and_phone_number_as_and_clicks_on_send_otp_button(string, string2);
    }

    @Then("User gets error message as {string}")
    public void user_gets_error_message_as(String msg) {
        loginPageObjects.user_gets_error_message_as(msg);
    }

    @When("User do not enter any name and phone number but clicks on Submit Button")
    public void user_do_not_enter_any_name_and_phone_number_but_clicks_on_submit_button() {
        loginPageObjects.user_do_not_enter_any_name_and_phone_number_but_clicks_on_submit_button();
        user_gets_error_message_as(msg2);
    }

    @Then("User is able to enter only {string} digits in the Mobile text field")
    public void user_is_able_to_enter_only_digits_in_the_mobile_text_field(String string) {
        loginPageObjects.user_is_able_to_enter_only_digits_in_the_mobile_text_field(string);
    }

    @When("User enters {string} in search text box")
    public void user_enters_in_search_text_box(String SearchInput1) {
        homePageObjects.user_enters_in_search_text_box(SearchInput1);
    }

    @When("User clicks search button")
    public void user_clicks_search_button() {
        homePageObjects.user_clicks_search_button();
    }

    @Then("User is able to see search result related to restaurants")
    public void user_is_able_to_see_search_result_related_to_restaurants() {
        homePageObjects.user_is_able_to_see_search_result_related_to_restaurants();
    }

    @Then("User is able to see the drop down under search text box with all the items with text {string}")
    public void user_is_able_to_see_the_drop_down_under_search_text_box_with_all_the_items_with_text(String string) {
        user_enters_in_search_text_box(SearchInput2);

    }
    @When("User clicks on {string}")
    public void user_clicks_on(String string) {
        homePageObjects.user_clicks_on(string);
    }
    @Then("User is navigates to the corresponding link related to {string}")
    public void user_is_navigates_to_the_corresponding_link_related_to(String string) {
        homePageObjects.user_is_navigates_to_the_corresponding_link_related_to(string);
    }
    @Given("User navigates to Customer care page by clicking on Customer Care tab at the right-mid of the page")
    public void user_navigates_to_customer_care_page_by_clicking_on_customer_care_tab_at_the_right_mid_of_the_page() {
        homePageObjects.user_navigates_to_customer_care_page_by_clicking_on_customer_care_tab_at_the_right_mid_of_the_page();
    }
    @When("User enter {string} in the Text box")
    public void user_enter_in_the_text_box(String string) {
        homePageObjects.user_enter_in_the_text_box(string);
    }
    @Then("User is able to see the drop down and all the items in the list must have text as {string}")
    public void user_is_able_to_see_the_drop_down_and_all_the_items_in_the_list_must_have_text_as(String string) {
        homePageObjects.user_is_able_to_see_the_drop_down_and_all_the_items_in_the_list_must_have_text_as(string);
    }


}
