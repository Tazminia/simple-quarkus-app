package tn.tjegham.simpleapi;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static tn.tjegham.simpleapi.Greeting.DEFAULT_GREETING_MESSAGE;

@QuarkusTest
public class GreetingResourceTest {

    @Test
    public void testHelloEndpoint() {

        given()
                .when().get("/greeting")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .contentType(ContentType.JSON).extract().response().jsonPath().getString("message")
                .equals(DEFAULT_GREETING_MESSAGE);
    }

}