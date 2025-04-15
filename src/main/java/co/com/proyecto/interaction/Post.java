package co.com.proyecto.interaction;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.interactions.RestInteraction;

import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class Post extends RestInteraction {

    private final String recurso;

    @Override
    public <T extends Actor> void performAs(T actor) {
        rest().log().all().post(CallAnApi.as(actor).resolve(recurso)).then().log().all();
    }

    public static Post to(String recurso) {
        return instrumented(Post.class, recurso);
    }
}
