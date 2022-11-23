package ch.zli.m223;
import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;


@QuarkusTest
public class BenutzerRessourceTest {

  String admimJwt = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJpc3MiOiJodHRwczovL2V4YW1wbGUuY29tL2lzc3VlciIsInVwbiI6ImFuZEBiYXQuY29tIiwiZ3JvdXBzIjpbImFkbWluIl0sImlhdCI6MTY2NDM3NDE1NywiZXhwIjozODExODU3ODA0LCJqdGkiOiIwMWIwYmFmYy1mZDdkLTQ2M2MtYWQ4Mi03YWI2ZTlkYjk4NGQifQ.lhaZSXCjtUjs5T56DjheIUzltH7zEj0FfvEETUmYMlfsci-mSR61K0MBzwBxzMYMneo2V72PJ6r5_UL7LAQkcweKoE3ixaTLo93TnerdtH6jgFeOQYTDBDJPCzUNEvQecC8eOdVMYQBZwOzz5t5wtzu9TKgfVXTRP1vFE10N7DXe8XIWNL6yRCaHziLmGtqYvNCOjput87upFjgFG_GZjMmtJCTC1f9cT62ki7tAiPIzAR48I-8jetKm86AlSKdoB0a8n9WaKY_9FUHUVfrlbKF8sKfMpJiXZka7C1C0o887YrdLUgwz7Vb8kv1J6X4YEbs0u5ec1qd7cQS8ehslsA";


  //Test UpdateBenutzer
    @Test
    public void testUpdateBenutzer() {
      given()
      .auth().oauth2(admimJwt)
      .when().get("/benutzer/1")
      .then()
          .statusCode(401);
    }

      //Test Delete
      @Test
      public void testDelete() {
        given()
        .auth().oauth2(admimJwt)
        .when().get("/benutzer/3")
        .then()
            .statusCode(401);
      }

           //Test Create
           @Test
           public void testCreateBenutzer() {
             given()
             .auth().oauth2(admimJwt)
             .when().get("/benutzer/2")
             .then()
                 .statusCode(401);
           }

      
  
}
