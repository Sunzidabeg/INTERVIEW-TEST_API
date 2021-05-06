package API_test;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;



public class Get_All_Users {
	
	@Test
	public void Get_request() {
		
		Response response= 
		
		given()
		.header("Content-Type","application/json")
		.when()
		.get("https://jsonplaceholder.typicode.com/posts")
		.then()
		.statusCode(200)
		.log().all()
		.extract().response();
			
			//status code validation
			int statusCode = response.getStatusCode();
			System.out.println("status code :"+statusCode);	
			
			Assert.assertEquals(statusCode, 200);	
			
			//negative test. test will fail due to the wrong status code
			
			//Assert.assertEquals(statusCode, 201);	
		
			
			//status line verification
			String statusline = response.getStatusLine();
			System.out.println("status line: "+statusline);
		}
		
	}
	


