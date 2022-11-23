package ch.zli.m223;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class CafeteriaRessourceTest {
  String mitgliedJwt = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJpc3MiOiJodHRwczovL2V4YW1wbGUuY29tL2lzc3VlciIsInVwbiI6InRlc3RAdGVzdC5jb20iLCJncm91cHMiOlsibWl0Z2xpZWQiXSwiaWF0IjoxNjY0Mzc0MTA4LCJleHAiOjM4MTE4NTc3NTUsImp0aSI6IjRmYzk5OGYwLTk5M2QtNGZjZS04OGIyLTEyYzE3MjAyNzMxMiJ9.GUmgmUVv6Froj4jCd_YF60riNFC_rjKZELz-87NmazlaahyXVWeDmAO4o6xgU4OokL7S4-1CENLNVHIvjm8YEaXbgydiqwQGhn44i5o6KxFEz_veCzV72EudBvMnHzJ9-rbxqqy7I87moVhOESiEukf8CgOT5XH_TztcXbjuyP2ilinOknXahv6i1lbCbzhK2R3d39ou7qDTIuzv720KSJtkhi3nFBpeM5lllaO0jvuRQebmfmblGSzvGajEwXEOAV_0xO9uYx1krem2YqPUNL1-pW3Q6YavBRNGo9YTwwJq6fs9uf_XbUm6pneLdwmgTYqOQ3Xkoss6WbdEAtN-vg";

  //Test zu CreateCafeteria

  @Test 
  public void TestCreateCafeteria() {
        given()
            .auth().oauth2(mitgliedJwt)
            .when().get("/cafeteria")
            .then()
                .statusCode(401);
    }
}
