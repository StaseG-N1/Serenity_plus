package example.stepdefinitions;

import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.То;

public class commonSteps {


    @Когда("открыть url")
    public void openURL() {
        System.out.println("открыть url");


    }

    @То("элемент '(.*)' отображен на странице")
    public void isDisplayed(String elementName) {

        System.out.println("элемент '"+elementName+"' отображен на странице");

    }
}
