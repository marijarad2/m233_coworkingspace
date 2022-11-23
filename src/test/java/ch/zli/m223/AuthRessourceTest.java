package ch.zli.m223;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;



/* 
 * @Marija Radovanovic 
 * @version 23.11.2022
*/

@QuarkusTest
public class AuthRessourceTest {

    @Test
    public void testPostLogin() {
        given()
            .contentType(ContentType.JSON)
            .when()
                .post("http://localhost:8080/login?email=and%40bat.com&password=and")
            .then()
            .statusCode(404);
    }

    @Test
    public void testPostRegister() {
        given()
        .body("{\"vorname\":\"marija\",\"nachname\":\"radovanovic\", \"email\":\"marija@gmail.com\", \"password\":\"123marija\"}")
        .contentType(ContentType.JSON)
        .when()
            .post("http://localhost:8080/auth/register")
            .then()
            .statusCode(500);
    }
}
