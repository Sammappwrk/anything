package Restassured;
import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;

public class Test04_deleteAPI 
{
	@Test
	 public void deleteAPI()
	 {
		 given().
		 delete("https://reqres.in/api/users/2").
		 then().
		 statusCode(204).log().all();
		 System.out.println();
	 }	
}
