package herokuapp;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideActionsTest {
    @Test
    void selenideActionsTest(){
        open("https://the-internet.herokuapp.com/drag_and_drop");
        actions().moveToElement($("#column-a")).clickAndHold().moveByOffset(200, 0).release().perform();
        $("#column-a").shouldHave(exactText("B"));
    }
}
