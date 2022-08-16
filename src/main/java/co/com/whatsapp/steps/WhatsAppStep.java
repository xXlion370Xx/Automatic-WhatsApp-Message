package co.com.whatsapp.steps;

import co.com.whatsapp.pagesobject.WhatsAppPage;
import net.thucydides.core.annotations.Step;

public class WhatsAppStep {

    // Write here your message to send to your contact
    private String message = "Your message";

    WhatsAppPage whatsAppPage = new WhatsAppPage();

    @Step
    public void openBrowser(){
        whatsAppPage.open();
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Step
    public void clickContact(){
        whatsAppPage.getDriver().findElement(whatsAppPage.getContact()).click();
    }

    @Step
    public void sendMessage(){
        whatsAppPage.getDriver().findElement(whatsAppPage.getChat()).click();
        whatsAppPage.getDriver().findElement(whatsAppPage.getChat()).sendKeys(message);
        whatsAppPage.getDriver().findElement(whatsAppPage.getEnterButton()).click();
    }
}
