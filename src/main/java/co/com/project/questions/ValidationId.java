package co.com.project.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

public class ValidationId implements Question<Integer> {

    @Override
    @Subject("Validacion del id")
    public Integer answeredBy(Actor actor) {
        
        return SerenityRest.lastResponse().jsonPath().get("id");
    }

    public static ValidationId  response() {
        return new ValidationId ();
    }
}
