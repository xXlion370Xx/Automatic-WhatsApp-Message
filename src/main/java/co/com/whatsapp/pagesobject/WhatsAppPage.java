package co.com.whatsapp.pagesobject;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://web.whatsapp.com/")
public class WhatsAppPage extends PageObject {

    //To search the contact on the whatsapp page list contact
    //Replace the word "Your contact here" to your whatsapp contact
    By contact = By.xpath("//span[contains(@title, 'Your contact here')]");

    //To select the text area chat
    By chat = By.xpath("//div[@class='p3_M1']");

    //To select submit button
    By enterButton = By.xpath("//div[@class='_3HQNh _1Ae7k']");

    public By getEnterButton() {
        return enterButton;
    }

    public void setEnterButton(By enterButton) {
        this.enterButton = enterButton;
    }

    public By getContact() {
        return contact;
    }

    public void setContact(By contact) {
        this.contact = contact;
    }

    public By getChat() {
        return chat;
    }

    public void setChat(By chat) {
        this.chat = chat;
    }
}
