package pages;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPageModal {

    public RegistrationPageModal checkHeader() {
        $(".modal-dialog").should(appear);
        $(".modal-open").shouldHave(text("Thanks for submitting the form"));

        return this;
    }

    public RegistrationPageModal checkText(String key, String value) {
        $(".modal-body").$(byText(key)).parent().shouldHave(text(value));

        return this;
    }
}
