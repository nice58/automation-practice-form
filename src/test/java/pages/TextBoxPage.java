package pages;


import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxPage {

    SelenideElement
            userNameInput = $("#userName"),
            userEmailInput = $("#userEmail"),
            addressInput1 = $("#currentAddress"),
            addressInput2 = $("#permanentAddress"),
            submit = $("#submit"),
            assertUserName = $(".mb-1#name"),
            assertUserEmail = $(".mb-1#email"),
            assertAddress1 = $(".mb-1#currentAddress"),
            assertAddress2 = $(".mb-1#permanentAddress");


    public TextBoxPage openPage() {
        open("/text-box");

        return this;
    }

    public TextBoxPage setUserName(String value) {
        userNameInput.setValue(value);

        return this;
    }

    public TextBoxPage setUserEmail(String value) {
        userEmailInput.setValue(value);

        return this;
    }

    public TextBoxPage setAddress1(String value) {
        addressInput1.setValue(value);

        return this;
    }

    public TextBoxPage setAddress2(String value) {
        addressInput2.setValue(value);

        return this;
    }

    public TextBoxPage setSubmit() {
        submit.click();

        return this;
    }

    public TextBoxPage checkUserName(String value) {
       assertUserName.shouldHave(text(value));

        return this;
    }

    public TextBoxPage checkUserEmail(String value) {
        assertUserEmail.shouldHave(text(value));

        return this;
    }

    public TextBoxPage checkAddress1(String value) {
        assertAddress1.shouldHave(text(value));

        return this;
    }

    public TextBoxPage checkAddress2(String value) {
        assertAddress2.shouldHave(text(value));

        return this;
    }
}

