package guru.qa.tests;

import com.codeborne.selenide.Configuration;
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
        $("[id=firstName]").setValue("Ruslan");
        $("[id=lastName]").setValue("Enikeev"); 
        $("[id=userEmail]").setValue("ruslan@enikeev.com");
        $("[id=gender-radio-1]").doubleClick();
        $("[id=userNumber]").setValue("9112223344");
        $("[id=dateOfBirthInput]").click();
        $("[class=react-datepicker__month-select]").selectOptionContainingText("January");
        $("[class=react-datepicker__month-select]").click();
        $("[class=react-datepicker__year-select]").selectOption(87);
        $("[class=react-datepicker__year-select]").click();
        $(".react-datepicker__day--001").click();
        $("#subjectsInput").click();
        $("#subjectsInput").setValue("Arts");
        $("#subjectsInput").pressEnter();
        $("#hobbiesWrapper").click();
        //$("#uploadPicture").doubleClick();
        //$("#uploadPicture").doubleClick();
        $("#uploadPicture").uploadFromClasspath("Jpg/1.txt");
        //"Ruslan" + " " + "Enikeev"
        $("#currentAddress").setValue("450000, Russian Federation, Ufa");
        //$("#state").selectOptionByValue("NCR");
        $("#state").click();
        $("#state").selectOptionByValue("NCR");
        $("#state").pressEnter();
        $("#state").pressEnter();

























               ;








        
        
       

    }
}
