package example.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HabrPage extends PageObject {

    @FindBy(how = How.XPATH, using = "//div[@class='tm-main-menu']")
    private WebElement mainMenu;

    @FindBy(how = How.XPATH, using = "//a[@href=\"/ru/search/\"]")
    private WebElement serchIcon;

    @FindBy(how = How.XPATH, using = "//form[@action=\"/ru/search/\"]//input")
    private WebElement serchField;

    @FindBy(how = How.XPATH, using = "//article")
    private List<WebElement> posts;


    public WebElement getMainMenu() {
        return this.mainMenu;
    }

    public WebElement getSerchIcon() {
        return serchIcon;
    }

    public WebElement getSerchField() {
        return serchField;
    }

    public List<WebElement> getPosts() {
        return posts;
    }

    public void serch(String text) throws InterruptedException {
        serchIcon.click();
        waitFor(serchField);
        serchField.sendKeys(text);
        serchField.sendKeys(Keys.ENTER);
    }


}
