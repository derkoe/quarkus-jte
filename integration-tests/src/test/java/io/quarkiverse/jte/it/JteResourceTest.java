package io.quarkiverse.jte.it;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class JteResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/jte")
                .then()
                .statusCode(200)
                .body(is("Hello jte"));
    }
}
