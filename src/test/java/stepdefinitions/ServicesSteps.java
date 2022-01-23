package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import tasks.*;
import utils.PathResponse;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ServicesSteps extends BaseTest{

    public ServicesSteps(){}

    @When("^use get petition to get information of Walter White$")
    public void use_get_petition_to_get_information_of_walter_white(){
        theActorInTheSpotlight().attemptsTo(GetCharacter.execute());
    }

    @When("^use get petition to get information of all characters$")
    public void use_get_petition_to_get_information_of_all_characters() {
        theActorInTheSpotlight().attemptsTo(GetAllCharacters.execute());
    }

    @Then("^print in console the birthday information$")
    public void print_in_console_the_birthday_information() {
        System.out.println("The Birthday of Walter White is: " + SerenityRest.lastResponse().jsonPath().getString(PathResponse.CHARACTER_BIRTHDAY.getPath()));
    }

    @Then("^print in console the their information$")
    public void print_in_console_the_their_information(){
        theActorInTheSpotlight().attemptsTo(PrintInformationCharacters.execute());
    }

}
