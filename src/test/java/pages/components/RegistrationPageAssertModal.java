package pages.components;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPageAssertModal {
    public void checkHeader() {
        $(".modal-dialog").should(appear);
        $(".modal-open").shouldHave(text("Thanks for submitting the form"));
    }
    public void checkText(String key, String value) {
        $(".modal-body").$(byText(key)).parent().shouldHave(text(value));
    }
}
