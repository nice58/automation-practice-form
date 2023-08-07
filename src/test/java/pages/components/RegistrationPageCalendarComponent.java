package pages.components;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationPageCalendarComponent {

    public void setDate(String day, String month, String year) {
        $("#dateOfBirthInput").click();
        $("select.react-datepicker__month-select").selectOption(month);
        $("select.react-datepicker__year-select").selectOption(year);
        $(".react-datepicker__day--0" + day + ":not(.react_datepicker__" + day + "--outside-month)").click();
    }
}
