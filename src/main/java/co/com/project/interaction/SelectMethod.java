package co.com.project.interaction;

import co.com.project.models.Information;
import co.com.project.task.Create;
import co.com.project.task.GetConsult;
import co.com.project.task.Update;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

@AllArgsConstructor

public class SelectMethod implements Interaction {

    String method;
    Information information;

    @Override
    public <T extends Actor> void performAs(T actor) {

        switch (method) {
            case "GET":
                actor.attemptsTo(
                        GetConsult.information(information));
                break;
            case "POST":
                actor.attemptsTo(
                        Create.information(information));
                break;
            case "PATCH":
                actor.attemptsTo(
                        Update.information(information));
                break;

            default:
                break;
        }

    }

    public static SelectMethod method(String method, Information information) {
        return new SelectMethod(method, information);
    }

}