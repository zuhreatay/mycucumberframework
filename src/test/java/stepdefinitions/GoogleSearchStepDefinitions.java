package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class GoogleSearchStepDefinitions {

    GooglePage googlePage= new GooglePage();

    @Given("user is in the google page")
    public void user_is_in_the_google_page() {
        Driver.getDriver().get("https://www.google.com");

    }

    @Given("user searches teapot")
    public void user_searches_teapot() {
    googlePage.searchBox.sendKeys("teapot");
    googlePage.searchBox.submit();
    }

    @Then("verify result has teapot")
    public void verify_result_has_teapot() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("teapot"));

    }
    @Given("user searches nokia")
    public void user_searches_nokia() {
        googlePage.searchBox.sendKeys("nokia"+ Keys.ENTER);
    }


    @Then("verify result has nokia")
    public void verify_result_has_nokia() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("nokia"));

    }
    @Given("user searches {string}")
    public void user_searches(String string) {
        googlePage.searchBox.sendKeys(string+Keys.ENTER);
    }

    @Then("verify result has {string}")
    public void verify_result_has(String string) {
        String title= Driver.getDriver().getTitle();
      Assert.assertTrue(title.contains(string));
    }
    @Given("user search red dress")
    public void user_search_red_dress() {
     googlePage.searchBox.sendKeys("red dress"+Keys.ENTER);

    }

    @Then("verify result has red dress")
    public void verify_result_has_red_dress() {
     Assert.assertTrue(Driver.getDriver().getTitle().contains("red dress"));
    }

    @Given("user search facebook")
    public void user_search_facebook() {
        googlePage.searchBox.sendKeys("facebook"+Keys.ENTER);
    }

    @Given("user enters  username")
    public void user_enters_username() {
        googlePage.faceUsername.sendKeys(ConfigurationReader.getProperty("face_username"));

    }

    @Given("user enters   password")
    public void user_enters_password() {
     googlePage.facePasword.sendKeys(ConfigurationReader.getProperty("face_password"));
    }

    @Given("user enters login")
    public void user_enters_login() {
        googlePage.faceLoginButton.click();
    }

    @Then("verify result has eslem mina")
    public void verify_result_has_eslem_mina() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("eslem mina"));
    }

    @Given("user is in the facebook page")
    public void user_is_in_the_facebook_page() {
        Driver.getDriver().get("https://www.facebook.com");
    }

}
