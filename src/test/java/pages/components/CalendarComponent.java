package pages.components;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {

    public void setDate(String locator, String day, String month, String year) {
        if (day.length() == 1 ) {
            day = "0" + day;
        }
        $(locator).click();
        $("select.react-datepicker__month-select").selectOption(month);
        $("select.react-datepicker__year-select").selectOption(year);
        $(".react-datepicker__day--0" + day + ":not(.react_datepicker__" + day + "--outside-month)").click();
    }
}
