package co.com.project.stepdefinitions;





import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

import java.util.List;

import org.hamcrest.Matchers;

import co.com.project.enums.*;
import co.com.project.exceptions.Exceptions;
import co.com.project.interaction.SelectMethod;
import co.com.project.models.Information;
import co.com.project.questions.ValidationId;
import co.com.project.questions.ValidationIdUpdate;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JsonPlaceStepDefinitions {

  
    @Given("that the request service is made")
    public void thatTheRequestServiceIsMade() {
        theActorInTheSpotlight().whoCan(CallAnApi.at(Constants.BASE_URL.getValue()));
    }

    @When("testing the {string} method with the following data")
    public void testingTheMethodWithTheFollowingData(String method, List<Information> data) {
       theActorInTheSpotlight().attemptsTo(SelectMethod.method(method, data.get(0)));
    }

    @Then("it check the result {int}")
    public void itCheckTheResultId(int id) {
        theActorInTheSpotlight().should(seeThatResponse(
                "successful code", response -> response.statusCode(200)),
                seeThat(ValidationId.response(), Matchers.is(id))
                        .orComplainWith(Exceptions.class, Message.MSG_ERR_ID.getMensaje()));
    }

    @Then("it check the result with the code {int} and {int}")
    public void itCheckTheResultWithTheCodeAnd(Integer code, Integer id) {
        theActorInTheSpotlight().should(seeThatResponse(
                "successful code", response -> response.statusCode(code)),
                seeThat(ValidationIdUpdate.response(), Matchers.is(id))
                        .orComplainWith(Exceptions.class, Message.MSG_ERR_ID.getMensaje()));
    }

   

}
