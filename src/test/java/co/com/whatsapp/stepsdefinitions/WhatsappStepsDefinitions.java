package co.com.whatsapp.stepsdefinitions;

import co.com.whatsapp.steps.WhatsAppStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class WhatsappStepsDefinitions {

    @Steps
    WhatsAppStep whatsAppStep;
    @Given("^The user is on whatsapp$")
    public void theUserIsOnWhatsapp() {
        whatsAppStep.openBrowser();
    }

    @When("^The user search her contact$")
    public void theUserSearchHerContact() {
        whatsAppStep.clickContact();
    }

    @Then("^The user send a message$")
    public void theUserSendAMessage() {
        whatsAppStep.sendMessage();
    }
}
