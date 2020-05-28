package coop.co.uk;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Page;

public class StepDef {

Page page=new Page();

    @Given("^I am on Homepage$")
    public void i_am_on_Homepage() throws Throwable {
        page.baseurl();
    }

    @When("^I fill up all necessary information$")
    public void i_fill_up_all_necessary_information() throws Throwable {
    page.detail();
    }

    @Then("^I should join Coop Memebership\\.$")
    public void i_should_join_Coop_Memebership() throws Throwable {

    }

}