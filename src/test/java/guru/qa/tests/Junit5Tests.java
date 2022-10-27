package guru.qa.tests;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Junit5Tests {

    @BeforeEach
    void openYaPage() {
        Selenide.open("https://ya.ru");
            }

    @AfterEach
    void close() {
        WebDriverRunner.closeWindow();
    }

    @Test
    void assertTest() {
           // ... поиск в новостях

    }

    @Test
    void assertTest1() {
            // ... поиск в картинках

    }
    @Test
    void assertTest2() {
        // ... поиск в новостях

    }

    @Test
    void assertTest3() {
        // ... поиск в картинках

    }
}
