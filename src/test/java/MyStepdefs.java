import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class MyStepdefs {

    private  String url = null;
    private static Response response;


    @Given("We have a valid Endpoint {string}")
    public void weHaveAValidEndpoint(String arg0) {
        url = arg0;
        RestAssured.baseURI = url;
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
    }

    @When("We hit that endpoint and receive a response")
    public void weHitThatEndpointAndReceiveAResponse() {

        RestAssured.baseURI = url;
        RequestSpecification request = RestAssured.given();
        response = request.get("");

//        String jsonString = response.toString();
//        List<Map<String, String>> userDetails = JsonPath.from(jsonString).get("");


    }

    @Then("User with id <id> has the name of <firstname> and email of <email>")
    public void userWithIdIdHasTheNameOfFirstnameAndEmailOfEmail(int id, String firstname, String email) {

//        get(uri + "/movie/" + testMovie.getId()).then()
//                .assertThat()
//                .statusCode(HttpStatus.OK.value())
//                .body("id", equalTo(testMovie.getId()))
//                .body("name", equalTo(testMovie.getName()))
//                .body("synopsis", notNullValue());
    }


}
