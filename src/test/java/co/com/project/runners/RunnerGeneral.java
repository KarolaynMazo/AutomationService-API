package co.com.project.runners;

import net.serenitybdd.cucumber.cli.Main;

public class RunnerGeneral {
    public static void main(String[] args) throws Throwable {
        Main.main(new String[]{"-g", "co.com.project.stepdefinitions",
        "-g", "co.com.project.setup",
         "src/test/resources/features/json_place_holder.feature"});        
    }
}
