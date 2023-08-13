package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RegistrationPage {

    CalendarComponent calendar = new CalendarComponent();
    RegistrationPageModal assertModal = new RegistrationPageModal();

    SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            genderWrapper = $("#genterWrapper"),
            userNumber = $("#userNumber"),
            bithDateInput = $("#dateOfBirthInput"),
            subjectsInput = $("#subjectsInput"),
            hobbiesWrapper = $("#hobbiesWrapper"),
            uploadPicture = $("input#uploadPicture"),
            userAddres = $("textarea#currentAddress"),
            state = $("#state"),
            city = $("#city"),
            submit = $("button#submit");


    public RegistrationPage openPage() {
        open("/automation-practice-form");

        return this;
    }

    public RegistrationPage remove() {
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        return this;
    }

    public RegistrationPage setFirstName(String value) {
        firstNameInput.setValue(value);

        return this;
    }

    public RegistrationPage setLastName(String value) {
        lastNameInput.setValue(value);

        return this;
    }

    public RegistrationPage setUserEmail(String value) {
        userEmailInput.setValue(value);

        return this;
    }

    public RegistrationPage setGender(String value) {
        genderWrapper.$(byText(value)).click();

        return this;
    }

    public RegistrationPage setMobileNumber(String value) {
        userNumber.setValue(value);

        return this;
    }

    public RegistrationPage setBirthDate(String day, String month, String year) {
        bithDateInput.click();
        calendar.setDate("#dateOfBirthInput", day, month, year);

        return this;
    }

    public RegistrationPage setSubjects(String value) {
        subjectsInput.setValue(value).pressEnter();

        return this;
    }

    public RegistrationPage setHobby(String value) {
        hobbiesWrapper.$(byText(value)).click();

        return this;
    }

    public RegistrationPage setPicture(String filename) {
        uploadPicture.uploadFromClasspath(filename);

        return this;
    }

    public RegistrationPage setAddress(String value) {
        userAddres.setValue(value);

        return this;
    }

    public RegistrationPage setState(String value) {
        state.scrollTo().click();
        state.$(byText(value)).click();

        return this;
    }

    public RegistrationPage setCity(String value) {
        city.scrollTo().click();
        city.$(byText(value)).click();

        return this;
    }

    public RegistrationPage setSubmit() {
        submit.click();

        return this;
    }
}


