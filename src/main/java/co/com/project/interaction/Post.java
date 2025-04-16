package co.com.project.interaction;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.interactions.RestInteraction;

import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class Post extends RestInteraction {

    private final String resource;

    @Override
    public <T extends Actor> void performAs(T actor) {
        rest().log().all().post(CallAnApi.as(actor).resolve(resource)).then().log().all();
    }

    public static Post to(String resource) {
        return instrumented(Post.class, resource);
    }
}
