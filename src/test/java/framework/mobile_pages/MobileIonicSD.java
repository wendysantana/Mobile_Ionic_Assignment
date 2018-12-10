package framework.mobile_pages;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.mobile_pages.MobileIonicLandingPage;

public class MobileIonicSD{
        private MobileIonicLandingPage landingPage = new MobileIonicLandingPage();

        //@mobile-search-1
        @Given("^I am on Splash screen of the ionic conference app$")
        public void openScreen() { }

        @When("^I swipe right (.+) times on tutorials slides$")
        public void SwipeRight() { }

        @Then("^I verify Continue button is displayed$")


        //@mobile-search-2
        @Given("^I am on a home page of the app$")

        @When("^I click on filter button$")

        @And("^I disable (.+) option$")
        public void disableOption() {
        }

        @And("^I click on All Reset Filer button$")

        @Then("^I verify all options are enabled$")
        public void verifyOptions() {
        }


    }

