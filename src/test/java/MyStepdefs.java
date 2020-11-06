import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.*;

public class MyStepdefs {

    private  String url = null;


    @Given("We have a valid Endpoint {string}")
    public void weHaveAValidEndpoint(String arg0) {
        RestAssured.baseURI = arg0;
    }

    @When("We hit that endpoint and receive a response")
    public void weHitThatEndpointAndReceiveAResponse() {


    }

    @Then("User with id <id> has the name of <firstname> and email of <email>")
    public void userWithIdIdHasTheNameOfFirstnameAndEmailOfEmail(int id, String firstname, String email) {
    }


}
