import static io.restassured.RestAssured.given;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
public class RestAssured_Project {
    // Declare request specification
    RequestSpecification requestSpec;
    // Declare response specification
    ResponseSpecification responseSpec;
    // Global properties
    String sshKey;
    int sshKeyId;
    @BeforeClass
    public void setUp() {
        // Create request specification
        requestSpec = new RequestSpecBuilder()
                // Set content type
                .setContentType(ContentType.JSON)
                .addHeader("Authorization", "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")
                // Set base URL
                .setBaseUri("https://api.github.com")
                // Build request specification
                .build();

        sshKey = "ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAILdRqlN5QkJE5YkJ0lxPUM+j8OxujbUXwKDfphA0i5HY";
    }

    @Test(priority = 1)
    // Test case using a DataProvider
    public void addKeys() {
        String reqBody = "{\"title\": \"B44-M1-RA\", \"key\": \"" + sshKey + "\" }";
        Response response = given().spec(requestSpec) // Use requestSpec
                .body(reqBody) // Send request body
                .when().post("/user/keys"); // Send POST request

        String resBody = response.getBody().asPrettyString();
        System.out.println(resBody);
        System.out.println(response);
        System.out.println(response.getStatusCode());
        sshKeyId = response.then().extract().path("id");

        // Assertions
        response.then().statusCode(201);
    }

    @Test(priority = 2)
    // Test case using a DataProvider
    public void getKeys() {
        Response response = given().spec(requestSpec) // Use requestSpec
                .when().get("/user/keys"); // Send GET Request

        System.out.println(response.headers());
        String resBody = response.getBody().asPrettyString();
        System.out.println(resBody);
        System.out.println(response.getStatusCode());

        // Assertions
        response.then().statusCode(200);
    }

    @Test(priority = 3)
    // Test case using a DataProvider
    public void deleteKeys() {
        Response response = given().spec(requestSpec) // Use requestSpec
                .pathParam("keyId", sshKeyId).when().delete("/user/keys/{keyId}"); // Send GET Request

        String resBody = response.getBody().asPrettyString();
        System.out.println(resBody);
        System.out.println(response.getStatusCode());


        // Assertions
        response.then().statusCode(204);

    }
}