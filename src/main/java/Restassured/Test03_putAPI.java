package Restassured;
import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
public class Test03_putAPI 
{	
	@Test
	public void putTest() 
	{
		JSONObject resqust= new JSONObject();
		resqust.put("name", "kapil");
		resqust.put("job", "Testing ");		
		given().
		header("Content-Type", "application/json").
		contentType(ContentType.JSON).
			body(resqust.toJSONString()).
		when().
			put("https://reqres.in/api/users/2").
		then().
			statusCode(200).log().all();		
	}
}
