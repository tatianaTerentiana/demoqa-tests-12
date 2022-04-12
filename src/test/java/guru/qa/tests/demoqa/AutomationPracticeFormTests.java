package guru.qa.tests.demoqa;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.impl.WebElementSelector;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class AutomationPracticeFormTests {

    @BeforeAll
    static void setUp() {
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void fillFormTest() {
        String testFirstName = "Tatiana";
        String testLastName = "Terentiana";
        String testEmail = "tatiana@terentiana.com";
        String testPhone = "89771796663";
        String TestDateOfBirth = "16 Sep 1994";


        open("/automation-practice-form");

        $("#firstName").setValue(testFirstName);
        $("#lastName").setValue(testLastName);
        $("#userEmail").setValue(testEmail);

        //radiobutton
        $(byText("Male")).click();





        $("#userNumber").setValue(testPhone);

        //date
        //form-control react-datepicker-ignore-onclickoutside


        //$x("//input[@id='dateOfBirthInput']").clear();
        //$("#dateOfBirthInput").clear();
        //$x("//input[@id='dateOfBirthInput']").setValue("16 Sep 1994");

        //$("#dateOfBirthInput").click();

        //$("#dateOfBirthInput").setValue(TestDateOfBirth);
        //didn't work: $("#dateOfBirthInput").setValue(TestDateOfBirth);
        //it didn't work too $("#dateOfBirthInput").data(TestDateOfBirth);

        $("#subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3").setValue("Arts");

        //checkbox
        $(byText("Sports")).click();
        $(byText("Music")).click();









    }

}
