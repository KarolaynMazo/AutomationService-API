package co.com.proyecto.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

public class ValidacionId implements Question<Integer> {

    @Override
    @Subject("Se obtiene el token de acceso")
    public Integer answeredBy(Actor actor) {
        
        return SerenityRest.lastResponse().jsonPath().get("id");
    }

    public static ValidacionId  response() {
        return new ValidacionId ();
    }
}
