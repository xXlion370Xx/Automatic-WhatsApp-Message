package co.com.whatsapp.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/sendMessage.feature",
snippets = SnippetType.CAMELCASE,
glue = "co.com.whatsapp.stepsdefinitions")
public class WhatsAppRunner {
}
