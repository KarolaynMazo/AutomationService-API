package co.com.proyecto.interaction;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.interactions.RestInteraction;

import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class Patch extends RestInteraction {

    private final String recurso;

    @Override
    public <T extends Actor> void performAs(T actor) {
        rest().log().all().patch(CallAnApi.as(actor).resolve(recurso)).then().log().all();
 
    }

    public static Patch to(String recurso) {
        return instrumented(Patch.class, recurso);
    }
}
