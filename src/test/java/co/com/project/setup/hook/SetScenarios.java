package co.com.project.setup.hook;

import java.net.MalformedURLException;


import io.cucumber.java.Before;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class SetScenarios {
       @Before(order = 0)
    public void setUp() throws MalformedURLException {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActor("Analyst");
        SerenityRest.useRelaxedHTTPSValidation();
    }
}
