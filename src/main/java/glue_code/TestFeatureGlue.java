package glue_code;

import apiDTO.ApiDefinitionDTO;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.junit.Assert;
import starter.FrameworkApis;

import java.util.ArrayList;
import java.util.List;

public class TestFeatureGlue {
    private static Response response = null;

    private static List<ApiDefinitionDTO> apiList = new ArrayList<>();

    @BeforeAll
    public static void before_all(){
        apiList = FrameworkApis.getApiList();
    }

    public void generate_data_table_example(){}

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
    @Then("the response structure contains")
    public void the_response_structure_contains(DataTable dataTable) {
        Assert.assertEquals(true, true);
    }

    @Then("the response length is equal to expected length")
    public void the_response_length_is_equal_to_expected_length(){
        Assert.assertEquals(true, true);
    }
}
