package tn.tjegham.simpleapi;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.eclipse.microprofile.config.inject.ConfigProperties;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class GreetingResourceTest {
    @ConfigProperty(name = "greeting.message")
    private String greetingMessage;

    @Test
    public void testHelloEndpoint() {

        given()
                .when().get("/greeting")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .contentType(ContentType.JSON).extract().response().jsonPath().getString("message")
                .equals(greetingMessage);
    }

}