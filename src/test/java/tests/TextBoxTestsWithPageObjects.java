package tests;

import org.junit.jupiter.api.Test;
import pages.TextBoxPage;


public class TextBoxTestsWithPageObjects extends TestBase {

    TextBoxPage textBoxPage = new TextBoxPage();


    @Test
    void fillFormTest() {
        textBoxPage.openPage()
                .setUserName("Alex Egorov")
                .setUserEmail("alex@egorov.com")
                .setAddress1("Some address 1")
                .setAddress2("Another address 1")
                .setSubmit()
                .checkUserName("Alex Egorov")
                .checkUserEmail("alex@egorov.com")
                .checkAddress1("Some address 1")
                .checkAddress2("Another address 1");
    }
}
