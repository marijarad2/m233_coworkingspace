package ch.zli.m223;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

import static io.restassured.RestAssured.given;

//TestRaum
@QuarkusTest
public class RaumRessourceTest {
  String admimJwt = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJpc3MiOiJodHRwczovL2V4YW1wbGUuY29tL2lzc3VlciIsInVwbiI6ImFuZEBiYXQuY29tIiwiZ3JvdXBzIjpbImFkbWluIl0sImlhdCI6MTY2NDM3NDE1NywiZXhwIjozODExODU3ODA0LCJqdGkiOiIwMWIwYmFmYy1mZDdkLTQ2M2MtYWQ4Mi03YWI2ZTlkYjk4NGQifQ.lhaZSXCjtUjs5T56DjheIUzltH7zEj0FfvEETUmYMlfsci-mSR61K0MBzwBxzMYMneo2V72PJ6r5_UL7LAQkcweKoE3ixaTLo93TnerdtH6jgFeOQYTDBDJPCzUNEvQecC8eOdVMYQBZwOzz5t5wtzu9TKgfVXTRP1vFE10N7DXe8XIWNL6yRCaHziLmGtqYvNCOjput87upFjgFG_GZjMmtJCTC1f9cT62ki7tAiPIzAR48I-8jetKm86AlSKdoB0a8n9WaKY_9FUHUVfrlbKF8sKfMpJiXZka7C1C0o887YrdLUgwz7Vb8kv1J6X4YEbs0u5ec1qd7cQS8ehslsA";
  String mitgliedJwt = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJpc3MiOiJodHRwczovL2V4YW1wbGUuY29tL2lzc3VlciIsInVwbiI6InRlc3RAdGVzdC5jb20iLCJncm91cHMiOlsibWl0Z2xpZWQiXSwiaWF0IjoxNjY0Mzc0MTA4LCJleHAiOjM4MTE4NTc3NTUsImp0aSI6IjRmYzk5OGYwLTk5M2QtNGZjZS04OGIyLTEyYzE3MjAyNzMxMiJ9.GUmgmUVv6Froj4jCd_YF60riNFC_rjKZELz-87NmazlaahyXVWeDmAO4o6xgU4OokL7S4-1CENLNVHIvjm8YEaXbgydiqwQGhn44i5o6KxFEz_veCzV72EudBvMnHzJ9-rbxqqy7I87moVhOESiEukf8CgOT5XH_TztcXbjuyP2ilinOknXahv6i1lbCbzhK2R3d39ou7qDTIuzv720KSJtkhi3nFBpeM5lllaO0jvuRQebmfmblGSzvGajEwXEOAV_0xO9uYx1krem2YqPUNL1-pW3Q6YavBRNGo9YTwwJq6fs9uf_XbUm6pneLdwmgTYqOQ3Xkoss6WbdEAtN-vg";

  //Test CreateRaum Mitglied
  @Test 
  public void TestCreateRaum() {
        given()
            .auth().oauth2(mitgliedJwt)
            .when().get("/raum")
            .then()
                .statusCode(401);
    }

    //Test CreateRaum Admin
    @Test 
    public void TestCreateRauma() {
          given()
              .auth().oauth2(admimJwt)
              .when().get("/raum")
              .then()
                  .statusCode(401);
      }

}
