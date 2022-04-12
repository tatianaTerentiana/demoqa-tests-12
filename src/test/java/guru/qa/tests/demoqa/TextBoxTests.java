package guru.qa.tests.demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
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
        String testName = "Tatiana Terentiana";
        String testEmail = "tatiana@terentiana.com";
        String testCurrentAddress = "Some street 1";
        String testPermanentAddress = "Another street 2";

        open("/text-box");

        $("[id=userName]").setValue(testName);
        $("[id=userEmail]").setValue(testEmail);
        $("[id=currentAddress]").setValue(testCurrentAddress);
        $("[id=permanentAddress]").setValue(testPermanentAddress);
        $("[id=submit]").click();
        //сокращение только для id и class
        //$("#submit").click();

        $("[id=output]").shouldHave(text(testName), text(testEmail), text(testCurrentAddress), text(testPermanentAddress));


        //$("[id=output] [id=name]").shouldHave(text(name));

        //Asserts
        $("[id=output]").$("[id=name]").shouldHave(text(testName));
        $("[id=output]").$("[id=email]").shouldHave(text(testEmail));
        $("[id=output]").$("[id=currentAddress]").shouldHave(text(testCurrentAddress));
        $("p[id=output]").$("[id=permanentAddress]").shouldHave(text(testPermanentAddress));

    }
}
