package Restassured;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.response.Response;

public class Test01_getAPI {
	
	
	@Test
	public void getAPI2()
	{		
		given().
		//header("Content-Type", "application/json").
		//param("", "")
			get("https://reqres.in/api/users?page=2").
		then().
			statusCode(200).body("data.id[1]", equalTo(8)).
			log().
			all();
	}
	@Test
	public void getAPI()
	{
		Response getresponse=get("https://reqres.in/api/users?page=2");		
		System.out.println("StatusCode is >>"+ getresponse.getStatusLine());
		System.out.println("StatusBody is >> "+ getresponse.getBody().asString());
		System.out.println("Status Code is >> " + getresponse.getStatusCode());
		System.out.println("Response Time is >> "+ getresponse.getTime());			
		// verify status code...
		int responsecode= getresponse.getStatusCode();
		Assert.assertEquals(responsecode, 200);
		System.out.println("Test case passed successfully...");
	}
	
	
}
