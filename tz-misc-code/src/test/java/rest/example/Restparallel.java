package rest.example;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.builder.RequestSpecBuilder;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.specification.RequestSpecification;

import static com.jayway.restassured.RestAssured.*;


public class Restparallel {

	RequestSpecification specification;


	@BeforeClass
	public static void setup() {
		String port = System.getProperty("server.port");
		if (port == null) {
			RestAssured.port = Integer.valueOf(8080);
		}
		else{
			RestAssured.port = Integer.valueOf(port);
		}


		String basePath = System.getProperty("server.base");
		if(basePath==null){
			basePath = "/rest-garage-sample/";
		}
		RestAssured.basePath = basePath;

		String baseHost = System.getProperty("server.host");
		if(baseHost==null){
			baseHost = "http://localhost";
		}
		RestAssured.baseURI = baseHost;

	}

	@BeforeMethod
	public void setUpSpecification(){
		RequestSpecBuilder builder = new RequestSpecBuilder();
		//builder.addQueryParam(parameterName, parameterValue); // define common parameters
		builder.setContentType(ContentType.JSON);
		specification = builder.build();
	}

	
	/** Simple Get Test  */
	@Test
	public void basicPingTest() {
		given().when().get("/garage").then().statusCode(200);
	}

	
	/** Data Provider & Parallel Test   */
	
	@DataProvider(parallel = true)
	public Object[] getId() {
		return new Object[] {"KD3856", "DK8937", "EF7301"};
	}

	@Test(dataProvider = "getId")
	public void responseTimeOfEndpoint(String id) {
		Map<String, String> map = new HashMap<>();
		map.put("id", id);

		given()
		.spec(specification)
		.body(map)
		.when()
		.log()
		.all()
		//	      .post(ENDPOINT_ADDRESS)
		.then()
		//	      .time(lessThan(2000L))
		.and()
		.statusCode(200);
	}


}
