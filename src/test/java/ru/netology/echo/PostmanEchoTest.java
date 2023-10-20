package ru.netology.echo;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {
    @Test
    void ShouldReturnSendData(){
        given()
                .baseUri("https://postman-echo.com")
                .body("Hi netology!")

                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body("data", equalTo("Hi!!!"));
    }


}
