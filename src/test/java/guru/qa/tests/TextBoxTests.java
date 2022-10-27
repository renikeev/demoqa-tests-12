package guru.qa.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void setUp() {
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void fillFormTest() {
        String name = "Alex Egorov";
        open("/text-box");

        $("[id=userName]").setValue(name);
        $("[id=userEmail]").setValue("alex@egorov.com");
        $("[id=currentAddress]").setValue("Some street 1");
        $("[id=permanentAddress]").setValue("Another street 2");
        $("[id=submit]").click();

        //Asserts
        $("[id=output]").shouldHave(Condition.text(name), Condition.text("alex@egorov.com"),
                Condition.text("Some street 1"), Condition.text("Another street 2"));

        $("[id=output] [id=name]").shouldHave(Condition.text(name));
        $("[id=output]").$("[id=name]").shouldHave(Condition.text(name));

        $("[id=permanentAddress]").shouldHave(Condition.text("Permananet Address :Another street 2")); // Wrong
        $("[id=permanentAddress]").shouldHave(Condition.text("Permananet Address :Another street 2"));
        $("[id=permanentAddress]", 1).shouldHave(Condition.text("Permananet Address :Another street 2"));

    }
}
