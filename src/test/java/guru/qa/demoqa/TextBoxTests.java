package guru.qa.demoqa;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {
    @Test
    void fillFormTest() {
        open("https://demoqa.com/text-box");

    }
}
