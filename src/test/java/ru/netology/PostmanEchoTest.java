package ru.netology;

import io.restassured.response.ValidatableResponse;
import org.junit.jupiter.api.Test;


import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;


public class PostmanEchoTest {

    @Test
    void Test() {
        // Given - When - Then
// Предусловия
        ValidatableResponse https;
        given()
                .baseUri("https://postman-echo.com")
                .body("privet") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body("data", equalTo("some value"));
    }
}
