package github;


import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

import static com.codeborne.selenide.Selectors.*;

public class BestContributorToSelenide {

    @Test
    void andreiSolntcevShouldBeFirstContributor() {

        open("https://github.com/selenide/selenide");
        //подвести мышку к первому аватару из блока contributors
        $("div.Layout-sidebar").$(byText("Contributors"))
//                .closest(".BorderGrid-cell").$$("ul li").first().hover();
                .closest("h2").sibling(0).$$("li").first().hover();
        //проверка: во всплываюшем окне есть текст Andrei Solntsev

        $(".Popover").shouldHave(text("Andrei Solntsev"));

        sleep(5000);


    }
}
