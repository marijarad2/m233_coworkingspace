package ch.zli.m223;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class RolleRessourceTest {
  String admimJwt = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJpc3MiOiJodHRwczovL2V4YW1wbGUuY29tL2lzc3VlciIsInVwbiI6ImFuZEBiYXQuY29tIiwiZ3JvdXBzIjpbImFkbWluIl0sImlhdCI6MTY2NDM3NDE1NywiZXhwIjozODExODU3ODA0LCJqdGkiOiIwMWIwYmFmYy1mZDdkLTQ2M2MtYWQ4Mi03YWI2ZTlkYjk4NGQifQ.lhaZSXCjtUjs5T56DjheIUzltH7zEj0FfvEETUmYMlfsci-mSR61K0MBzwBxzMYMneo2V72PJ6r5_UL7LAQkcweKoE3ixaTLo93TnerdtH6jgFeOQYTDBDJPCzUNEvQecC8eOdVMYQBZwOzz5t5wtzu9TKgfVXTRP1vFE10N7DXe8XIWNL6yRCaHziLmGtqYvNCOjput87upFjgFG_GZjMmtJCTC1f9cT62ki7tAiPIzAR48I-8jetKm86AlSKdoB0a8n9WaKY_9FUHUVfrlbKF8sKfMpJiXZka7C1C0o887YrdLUgwz7Vb8kv1J6X4YEbs0u5ec1qd7cQS8ehslsA";

    //Test FindAll Admin
    @Test 
    public void TestFindAll() {
          given()
              .auth().oauth2(admimJwt)
              .when().get("/rolle")
              .then()
                  .statusCode(401);
      }

    //Test FindbyId Admin
    @Test 
    public void TestfindById() {
          given()
              .auth().oauth2(admimJwt)
              .when().get("/rolle/1")
              .then()
                  .statusCode(401);
      }

   //Test CreateRole
    @Test 
    public void TestCreateRole() {
          given()
              .auth().oauth2(admimJwt)
              .when().get("/rolle")
              .then()
                  .statusCode(401);
      }


  
}
