package co.com.proyecto.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

public class ValidacionIdActualizar implements Question<Integer> {

    @Override
    @Subject("Validacion del id")
    public Integer answeredBy(Actor actor) {
        String id= SerenityRest.lastResponse().jsonPath().get("id").toString();
        return Integer.parseInt(id);
    }

    public static ValidacionIdActualizar  response() {
        return new ValidacionIdActualizar ();
    }
}
