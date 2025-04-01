package github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class SelenideRepositorySearch {

    @Test
    void shouldFindSelenideRepositoryAtTheTop() {


        //Открыть страницу  https://github.com/
        open("https://github.com");
        // Кликнуть на поле поиска
        $("[data-target='qbsearch-input.inputButton']").click();
        // ввести в поле поиска selenide и нажать enter
//        $("[placeholder='Search or jump to...']").setValue("selenide").pressEnter();
        $("#query-builder-test").setValue("selenide").pressEnter();
        //кликнуть на первый репо из списка
        $$("[data-testid = 'results-list']").first().$("a").click();

        //проверка заголовка selenide/selenide
        $("#repository-container-header").shouldHave(text("selenide / selenide"));

        sleep(5000);


        // .classname, #idl, [], a[href=abc].red


    }
}
