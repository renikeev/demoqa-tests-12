package guru.qa.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.files.DownloadActions.click;


public class StudentRegistrationForm {

    @BeforeAll
    static void setUp() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void FormTest() {
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Ruslan");
        $("#lastName").setValue("Enikeev");
        $("#userEmail").setValue("ruslan@enikeev.com");
        $("#gender-radio-1").doubleClick();
        $("#userNumber").setValue("9112223344");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOptionContainingText("January");
        $(".react-datepicker__month-select").click();
        $(".react-datepicker__year-select").selectOption(87);
        $(".react-datepicker__year-select").click();
        $(".react-datepicker__day--001").click();
        $("#subjectsInput").click();
        $("#subjectsInput").setValue("Arts");
        $("#subjectsInput").pressEnter();
        $(new ByText("Reading")).click();
        $("#uploadPicture").uploadFromClasspath("Jpg/1.txt");
        $("#currentAddress").setValue("450000, Russian Federation, Ufa");
        $("#react-select-3-input").setValue("NCR");
        $("#react-select-3-input").pressEnter();
        $("#react-select-4-input").setValue("Delhi");
        $("#react-select-4-input").pressEnter();
        $("#submit").pressEnter();
        $("#example-modal-sizes-title-lg").
                shouldHave(Condition.text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(Condition.text("Ruslan Enikeev"));
        $(".table-responsive").shouldHave(Condition.text("ruslan@enikeev.com"));
        $(".table-responsive").shouldHave(Condition.text("Male"));
        $(".table-responsive").shouldHave(Condition.text("9112223344"));
        $(".table-responsive").shouldHave(Condition.text("01 January,1987"));
        $(".table-responsive").shouldHave(Condition.text("Arts"));
        $(".table-responsive").shouldHave(Condition.text("Reading"));
        $(".table-responsive").shouldHave(Condition.text("1.txt"));
        $(".table-responsive").shouldHave(Condition.text("1.txt"));
        $(".table-responsive").shouldHave(Condition.text("450000, Russian Federation, Ufa"));
        $(".table-responsive").shouldHave(Condition.text("NCR Delhi"));
    }
}






