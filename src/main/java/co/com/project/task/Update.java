package co.com.project.task;

import co.com.project.enums.Constants;
import co.com.project.interaction.Patch;
import co.com.project.models.Information;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

@AllArgsConstructor
public class Update implements Task {
    private Information information;


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
               Patch.to(Constants.PATH_GET.getValue() + Integer.parseInt(information.getId())).with(requestSpecification -> requestSpecification
               .relaxedHTTPSValidation()
               .body(information)
               )
        );

    }

    public static Update information(Information information) {
        return Tasks.instrumented(Update.class, information);
    }
}
