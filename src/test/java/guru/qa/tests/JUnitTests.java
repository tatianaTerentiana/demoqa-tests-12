package guru.qa.tests;

import org.junit.jupiter.api.*;

public class JUnitTests {

    @BeforeAll
    static void initDB() {
        System.out.println("### @BeforeAll");
    }

    @BeforeEach
    void openYaPage() {
        System.out.println("###     @BeforeEach");
        //Selenide.open("http://yandex.ru");
    }

    @AfterEach
    void close() {
        System.out.println("###     @AfterEach");
        //WebDriverRunner.closeWindow();
    }

    @AfterAll
    static void cleanDB() {
        System.out.println("### @AfterAll");
    }


    @Test
    void assertTest() {
        //поиск в новостях
        System.out.println("###         @Test0");
    }

    @Test
    void assertTest2() {
        //поиск в картинках
        System.out.println("###         @Test1");
    }
}
