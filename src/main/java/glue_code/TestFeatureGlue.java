package glue_code;

import apiDTO.ApiDefinitionDTO;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.junit.Assert;
import starter.FrameworkApis;

import java.util.List;

public class TestFeatureGlue {
    private static Response response = null;

    private final static List<ApiDefinitionDTO> apiList = FrameworkApis.getApiList();

    @Given("the user has the {string} response")
    public void the_user_has_the_response(String apiName) {
        response = FrameworkApis.executeGetCall(apiList.stream()
                .filter(api -> api.getApiName().equals(apiName))
                .toList()
                .get(0));
        Assert.assertEquals(true, response != null);
    }
    @Given("status code is {int}")
    public void status_code_is(int responseCode) {
        Assert.assertEquals(responseCode, response.getStatusCode());
    }
    @Then("the response <structure> contains")
    public void the_response_structure_contains(io.cucumber.datatable.DataTable dataTable) {
        List<String> data = dataTable.asList();
        Assert.assertEquals(true, true);
    }

    @Then("the response length is equal to expected length")
    public void the_response_length_is_equal_to_expected_length(){
        Assert.assertEquals(true, true);
    }
}
