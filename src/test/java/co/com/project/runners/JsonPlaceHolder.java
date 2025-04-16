package co.com.project.runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = {"co.com.project.stepdefinitions","co.com.project.setup"},
        features = "src/test/resources/features/json_place_holder.feature",
        snippets = SnippetType.CAMELCASE,
        tags = "@Segundo"
)

public class JsonPlaceHolder {

}
