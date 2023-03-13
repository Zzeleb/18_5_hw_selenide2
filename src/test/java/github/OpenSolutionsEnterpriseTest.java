package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class OpenSolutionsEnterpriseTest {

    @Test
    void solutionsEnterpriseHoverTest() {

        //На главной странице GitHub
        open("https://github.com");
        // выберите меню Solutions -> Enterprise с помощью команды hover для Solutions.
        $("div.header-menu-wrapper").$(byText("Solutions")).hover();
        $(byLinkText("Enterprise")).click();
        // Убедитесь что загрузилась нужная страница (например что заголовок - "Build like the best."
        $("div.application-main").shouldHave(text("Build like the best"));

    }



}
