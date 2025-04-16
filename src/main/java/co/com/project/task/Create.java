package co.com.project.task;

import co.com.project.enums.Constants;
import co.com.project.interaction.Post;
import co.com.project.models.Information;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

@AllArgsConstructor
public class Create implements Task {
    private Information information;


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Post.to(Constants.PATH_POST.getValue()).with(requestSpecification -> requestSpecification
                .relaxedHTTPSValidation()
                .body(information))
               
             
        );

    }

    public static Create information(Information information) {
        return Tasks.instrumented(Create.class, information);
    }
}
