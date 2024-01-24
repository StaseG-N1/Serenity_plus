package example.stepdefinitions;

import example.pages.HabrPage;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.То;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.steps.UIInteractions;
import org.junit.Assert;

public class commonSteps extends UIInteractions {
    HabrPage pageHabr = new HabrPage();

    @Когда("^открыть url habr.com$")
    public void openURLYa() {
        String url = "https://habr.com/ru/feed/";
        openUrl(url);
        Serenity.recordReportData().withTitle("View log").andContents("URL :" + url + " успешно открыт в браузере");
    }

    @То("^верхнее меню сайта отображено на странице$")
    public void isDisplayedMainMenu() {
        Assert.assertTrue("Верхнее меню сайта НЕ отображено на странице", pageHabr.getMainMenu().isDisplayed());
    }

    @То("^ввести в поле поиска '(.*)'$")
    public void sendTextforSerchInput(String text) throws InterruptedException {
        pageHabr.serch(text);
    }

    @То("^список постов отображен на странице$")
    public void isDisplayedPosts() {
        Assert.assertTrue("Список постов НЕ отображен на странице", pageHabr.getPosts().size() > 0);
    }

}
