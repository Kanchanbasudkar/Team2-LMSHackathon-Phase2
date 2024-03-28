package com.lms.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.specification.RequestSpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UserLogin {

private static Logger logger= LogManager.getLogger(UserLogin.class);
private String userName;
private String password;

RequestSpecification request;


    @Given("User needs to signIn")
    public void user_needs_to_sign_in() {
     logger.info("Entering into user_needs_to_sign_in");
    }
    @When("User has to enter the userName {string}")
    public void user_has_to_enter_the_user_name(String string) {
        logger.info("User has to enter userName");
        userName=string;
    }
    @Then("user has to enter the password {string}")
    public void user_has_to_enter_the_password(String string) {
        logger.info("User has to enter password");
        password=string;
    }
    @Then("Verify the status code is {string}")
    public void verify_the_status_code_is(String string) {
        logger.info("status code should be 200");
        String request = "{\"password\":"+password+",\"userLoginEmailId\":"+userName+"}";

    }

}
