package registrationform;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class RegistrationFormTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void fillFormTest() {
        open("/automation-practice-form");


        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");



        $("#firstName").setValue("Sofy");
        $("#lastName").setValue("Chan");
        $("#userEmail").setValue("schan@email.com");
        $("#genterWrapper").$(byText("Female")).click();
        $("#userNumber").setValue("8000000001");

        $("#dateOfBirthInput").click();
        $("select.react-datepicker__year-select").selectOption("1995");
        $("select.react-datepicker__month-select").selectOption("March");
        $(".react-datepicker__day--010").click();

        //$("#subjectsInput").setValue("  ");
        //$("#subjectsWrapper").$(byText("Computer Science")).click();

        $("#subjectsInput").setValue("Computer Science").pressEnter();

        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#hobbiesWrapper").$(byText("Reading")).click();
        $("#hobbiesWrapper").$(byText("Music")).click();

        $("input#uploadPicture").uploadFromClasspath("text.txt");

        $("textarea#currentAddress").setValue("Address");

        $("#state").scrollTo().click();
        $("#state").$(byText("Rajasthan")).click();
        $("#city").click();
        $("#city").$(byText("Jaiselmer")).click();

        $("button#submit").click();


        //asserts
        $(".modal-open").shouldHave(text("Thanks for submitting the form"));

        $("tbody tr:nth-child(1) td:nth-child(2)").shouldHave(text("Sofy Chan"));
        $("tbody tr:nth-child(2) td:nth-child(2)").shouldHave(text("schan@email.com"));
        $("tbody tr:nth-child(3) td:nth-child(2)").shouldHave(text("Female"));
        $("tbody tr:nth-child(4) td:nth-child(2)").shouldHave(text("8000000001"));
        $("tbody tr:nth-child(5) td:nth-child(2)").shouldHave(text("10 March,1995"));
        $("tbody tr:nth-child(6) td:nth-child(2)").shouldHave(text("Computer Science"));
        $("tbody tr:nth-child(7) td:nth-child(2)").shouldHave(text("Sports, Reading, Music"));
        $("tbody tr:nth-child(8) td:nth-child(2)").shouldHave(text("text.txt"));
        $("tbody tr:nth-child(9) td:nth-child(2)").shouldHave(text("Address"));
        $("tbody tr:nth-child(10) td:nth-child(2)").shouldHave(text("Rajasthan Jaiselmer"));

        $("button#closeLargeModal").click();


        //Configuration.holdBrowserOpen=true;
    }
}