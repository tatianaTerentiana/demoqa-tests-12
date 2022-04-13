package guru.qa.tests.demoqa;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.impl.WebElementSelector;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
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
        String testPhone = "9771796663";
        String testCurrentAddress = "Russia, Moscow";
        String testGender = "Female";
        String testDate = "16 September,1994";
        String testSubject = "History";
        String testHobby = "Sports, Music";
        String testLocation = "NCR Noida";



        open("/automation-practice-form");

        $("#firstName").setValue(testFirstName);
        $("#lastName").setValue(testLastName);
        $("#userEmail").setValue(testEmail);

        //radiobutton
        $(byText("Female")).click();





        $("#userNumber").setValue(testPhone);

        //date
        //form-control react-datepicker-ignore-onclickoutside


        //$x("//input[@id='dateOfBirthInput']").clear();
        //$("#dateOfBirthInput").clear();
        //$x("//input[@id='dateOfBirthInput']").setValue("16 Sep 1994");

        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOptionByValue("8");
        $(".react-datepicker__year-select").selectOptionByValue("1994");
        $(".react-datepicker__day--016").click();

        //$("#dateOfBirthInput").setValue(TestDateOfBirth);
        //didn't work: $("#dateOfBirthInput").setValue(TestDateOfBirth);
        //it didn't work too $("#dateOfBirthInput").data(TestDateOfBirth);

        $("#subjectsInput").setValue("History").pressEnter();

        //checkbox
        $(byText("Sports")).click();
        $(byText("Music")).click();


        $("#uploadPicture").uploadFile(new File("src/test/resources/codeIt.jpg"));

        $("#currentAddress").setValue(testCurrentAddress);

        $("#react-select-3-input").setValue("NCR").pressEnter();
        $("#react-select-4-input").setValue("Noida").pressEnter();
        $("#submit").click();

        $("#react-select-3-input").setValue("Haryana").pressEnter();
        $("#react-select-4-input").setValue("Panipat").pressEnter();
        $("#submit").click();




        //Asserts
        //$("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        //$(".table-responsive").$(byText("Student Name")).shouldHave(text(testFirstName+" "+testLastName));
        //$(".table-responsive").$(byText("Student Email")).shouldHave(text(testEmail));
        //$(".table-responsive").$(byText("Gender")).shouldHave(text("Female"));
        //$(".table-responsive").$(byText("Mobile")).shouldHave(text(testPhone));
        //$(".table-responsive").$(byText("Date of Birth")).shouldHave(text("16 September,1994"));
        //$(".table-responsive").$(byText("Subjects")).shouldHave(text("History"));
        //$(".table-responsive").$(byText("Hobbies")).shouldHave(text("Sports, Music"));
        //$(".table-responsive").$(byText("Picture")).shouldHave(text("codeIt.png"));
        //$(".table-responsive").$(byText("Address")).shouldHave(text(testCurrentAddress));
        //$(".table-responsive").$(byText("State and City")).shouldHave(text("NCR Noida"));

        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(
                text(testFirstName + ' ' + testLastName),
                text(testEmail),
                text(testGender),
                text(testPhone),
                text(testDate),
                text(testSubject),
                text(testHobby),
                text("codeIt.jpg"),
                text(testCurrentAddress),
                text(testLocation)
        );


    }

}
