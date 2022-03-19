package com.adx.api.automation.adx;

import org.testng.annotations.Test;

import com.adx.api.automation.utils.RestUtils;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class AdxVehicleApiTest {

	String token="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdWQiOlsicmVzb3VyY2VfaWQiXSwidXNlcl9uYW1lIjoidmVua2F0ZXNobCswMDJAYXp1Z2EuY29tIiwic2NvcGUiOlsicmVhZCIsIndyaXRlIl0sImV4cCI6MTY2MjkzMzMxOCwiYXV0aG9yaXRpZXMiOlsiT1dORVIiXSwianRpIjoiY2U0ZDE1YWMtN2NmMC00M2ZlLWI1OTQtMjk1Mjg5ZTA4NzIwIiwiY2xpZW50X2lkIjoiMSJ9.7H_h3IcAzcSgRDciUvp6U3gaQLNqAGbvIExxpr0bA2Y";
	
//	@Test 
//	
//	public void CreateASingleVehicle () {
//		
//		RestAssured.baseURI="http://adx-uat.azuga.com";
//		RequestSpecification request = RestAssured.given();
//		
//		String payload ="{\r\n" + 
//				"    \"vin\": \"KNAGM4A76D5300251\",   \r\n" + 
//				"    \"nickname\": \"RDE\",\r\n" + 
//				"    \"year\": 2020,\r\n" + 
//				"    \"make\": \"toyota\",\r\n" + 
//				"    \"model\": \"fort\",\r\n" + 
//				"    \"trim\": \"dsl\",\r\n" + 
//				"    \"fuel\": \"Gasol\",\r\n" + 
//				"    \"licensePlate\": \"xc-01\",\r\n" + 
//				"    \"stateCode\": \"GA\",\r\n" + 
//				"    \"initialOdometer\": 1,\r\n" + 
//				"    \"combinedMilesPerGallon\": 1,\r\n" + 
//				"    \"grossWeightRating\": 10,\r\n" + 
//				"    \"engine\": \"engineType\",\r\n" + 
//				"    \"status\": \"ACTIVE\",\r\n" + 
//				"    \"registrationDate\": \"2022-03-15\"\r\n" + 
//				"}";
//		request.header("Authorization","Bearer "+token)
//	.header("Content-Type", "application/json;charset=UTF-8");
//	Response responseFromPostVehicle=request.body(payload).post("/azuga-adx-api/api/vehicles");
//	assertThat(responseFromPostVehicle.statusCode(),is(equalTo(201)));
//	System.out.println("THE RESPONSE IS AS FOLLOWS "+responseFromPostVehicle);
//	responseFromPostVehicle.prettyPrint();
//	
//	}
	
//	@Test
//	
//	public void getVinDetails() {
//	Map<String,String> testData= new HashMap<String,String>();
//		
//		//String url="http://adx-uat.azuga.com/azuga-adx-api/api/vehicles";
//		String url="http://adx-uat.azuga.com/azuga-adx-api/api/vehicles-search";
//		String veh="5NPE34AF8FH040880";
//		RestUtils util=new RestUtils();
//		testData.put("search", veh);
//		Response response =util.getWithParam(url, testData);
//		assertThat(response.statusCode(),is(equalTo(200)));
//		response.prettyPrint();
//		System.out.println("THE VEHICLE DETAILS IS AS FOLLOWS "+response);
//	}
//	
//	@Test
//	
//	public void getVinDetailsById() {
//	Map<String,String> testData= new HashMap<String,String>();
//		
//		//String url="http://adx-uat.azuga.com/azuga-adx-api/api/vehicles";
//		String url="http://adx-uat.azuga.com/azuga-adx-api/api/vehicles";
//		int id =241;
//		RestUtils util=new RestUtils();
//		Response response =util.getWithParam(url, testData);
//		assertThat(response.statusCode(),is(equalTo(200)));
//		response.prettyPrint();
//		System.out.println("THE VEHICLE DETAILS IS AS FOLLOWS "+response);
//	}
//	
	
//	
//	@Test
//	public void createMultipleVehicle()	{
//		File file =new File ("C:\\Users\\Dell\\eclipse-workspace\\adx\\MultiVehicle.csv");
//		RestAssured.baseURI="http://adx-uat.azuga.com";
//        RequestSpecification request = RestAssured.given();
//        
//        request.header("Authorization","Bearer "+token)
//        .multiPart("file",file,"multiPart/form-data");
//        Response response=request.post("/azuga-adx-api/api/import/vehicles");
//        assertThat(response.statusCode(),is(equalTo(201)));
//		response.prettyPrint();
//	}
	
//	@Test
//	public void updateVehicle() {
//		RestAssured.baseURI="http://adx-uat.azuga.com";
//		RequestSpecification request = RestAssured.given();
//		
//		String payload ="{\r\n" + 
//				"    \"vin\": \"WVWBS71K77W116783\",   \r\n" + 
//				"    \"nickname\": \"RDE\",\r\n" + 
//				"    \"year\": 1999,\r\n" + 
//				"    \"make\": \"honda\",\r\n" + 
//				"    \"model\": \"civic\",\r\n" + 
//				"    \"trim\": \"trim\",\r\n" + 
//				"    \"fuel\": \"ELEC\",\r\n" + 
//				"    \"licensePlate\": \"rrr-002\",\r\n" + 
//				"    \"stateCode\": \"GA\",\r\n" + 
//				"    \"initialOdometer\": 1,\r\n" + 
//				"    \"combinedMilesPerGallon\": 1,\r\n" + 
//				"    \"grossWeightRating\": 10,\r\n" + 
//				"    \"engine\": \"engineType\",\r\n" + 
//				"    \"status\": \"ACTIVE\",\r\n" + 
//				"    \"registrationDate\": \"2022-03-12\"\r\n" + 
//				"}";
//		request.header("Authorization","Bearer "+token)
//	.header("Content-Type", "application/json");
//	Response responseFromPostVehicle=request.body(payload).put("/azuga-adx-api/api/vehicles/237");
//	assertThat(responseFromPostVehicle.statusCode(),is(equalTo(200)));
//	System.out.println("THE RESPONSE IS AS FOLLOWS "+responseFromPostVehicle);
//	responseFromPostVehicle.prettyPrint();

//	}
	
//	@Test
//	public void delVehicle() {
//		RestAssured.baseURI="http://adx-uat.azuga.com";
//		RequestSpecification request = RestAssured.given();
//		
//		
//		request.header("Authorization","Bearer "+token)
//	.header("Content-Type", "application/json");
//	Response responseFromPostVehicle=request.delete("/azuga-adx-api/api/vehicles/237");
//	assertThat(responseFromPostVehicle.statusCode(),is(equalTo(200)));
//	System.out.println("THE RESPONSE IS AS FOLLOWS "+responseFromPostVehicle);
//	responseFromPostVehicle.prettyPrint();
//     }




}