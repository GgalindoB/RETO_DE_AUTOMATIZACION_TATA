package co.com.pruebas.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/data/basic_date.feature",
        glue = "co.com.pruebas.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE, //PaginaWeb
        plugin = "pretty",
        tags = "@datosbasicos"
)
public class DateRunner {
}
