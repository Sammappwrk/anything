package Restassured;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;
public class Test02_PostAPI
{
	@Test
	public void postapi()
	{		
		JSONObject resqust= new JSONObject();
		resqust.put("name", "Testing");
		resqust.put("job", "Testing ");		
		given().
		header("Content-Type", "application/json").
		contentType(ContentType.JSON).
			body(resqust.toJSONString()).
		when().
			post("https://reqres.in/api/users").
		then().
			statusCode(201).log().all();
	}
}
