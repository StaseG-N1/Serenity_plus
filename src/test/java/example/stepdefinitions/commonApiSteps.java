package example.stepdefinitions;

import io.cucumber.java.ru.Когда;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.Map;

import static net.serenitybdd.rest.SerenityRest.*;

public class commonApiSteps {

    static String url = "https://petstore.swagger.io/v2";

    @Когда("^создать пользователя с парметрами:$")
    public void сreatedUserApi(Map<String, Object> map) {
        Response res = given()
                .baseUri(url)
                .header("Content-type", "application/json")
                .and()
                .body(map)
                .when()
                .post("/user")
                .then()
                .extract()
                .response();
        Assert.assertEquals("Пользователь не создан", 200, res.statusCode());
        System.out.println("Пользователь успешно создан");
    }

    @Когда("^получить данные пользователя с username ='(.*)'$")
    public void getUserApi(String userName) {
        Response res = given()
                .baseUri(url)
                .header("Content-type", "application/json")
                .when()
                .get("/user/"+userName)
                .then()
                .extract()
                .response();
        Assert.assertEquals("Данные пользователя с username ='" + userName + "' не получены ", userName, res.jsonPath().getString("username"));
        System.out.println("Получены данные пользователя с username ='" + userName + "':");
        System.out.println("- Фамилия Имя: '" + res.jsonPath().getString("lastName") + " " + res.jsonPath().getString("firstName"));
        System.out.println("- Телефон : '" + res.jsonPath().getString("phone"));
        System.out.println("- Email : '" + res.jsonPath().getString("email"));
    }
}
