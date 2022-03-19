package com.adx.api.automation.adx;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;


import java.io.File;

public class AdxTripApiTest {
	String token="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdWQiOlsicmVzb3VyY2VfaWQiXSwidXNlcl9uYW1lIjoidmVua2F0ZXNobCswMDJAYXp1Z2EuY29tIiwic2NvcGUiOlsicmVhZCIsIndyaXRlIl0sImV4cCI6MTY2MjkzMzMxOCwiYXV0aG9yaXRpZXMiOlsiT1dORVIiXSwianRpIjoiY2U0ZDE1YWMtN2NmMC00M2ZlLWI1OTQtMjk1Mjg5ZTA4NzIwIiwiY2xpZW50X2lkIjoiMSJ9.7H_h3IcAzcSgRDciUvp6U3gaQLNqAGbvIExxpr0bA2Y";
//	@Test 
//	
//	public void CreateASingleVehicle () {
//		
//		
//		RestAssured.baseURI="http://adx-uat.azuga.com";
//		RequestSpecification request = RestAssured.given();
//		
//		String payload ="{\r\n" + 
//				"  \"tripDetails\": [\r\n" + 
//				"    {\r\n" + 
//				"      \"endOdometer\": 4396.1,\r\n" + 
//				"	   \"startOdometer\": 4356.1,\r\n" + 
//				"      \"tripEndTime\": \"12-03-2021 00:10:13\",\r\n" + 
//				"      \"tripStartTime\": \"12-03-2021 00:07:58\",\r\n" + 
//				"      \"vin\": \"5NPE34AF8FH040880\",\r\n" + 
//				"      \"gpsPoints\": [\r\n" + 
//				"        {\r\n" + 
//				"          \"lat\": 45.5327399,\r\n" + 
//				"          \"lon\": -122.622223,\r\n" + 
//				"          \"odometer\": 4356.1,\r\n" + 
//				"          \"time\": \"12-03-2021 17:55:06\"\r\n" + 
//				"        },\r\n" + 
//				"		{\r\n" + 
//				"			\"lat\" :45.528004,\r\n" + 
//				"			\"lon\" : -122.611321,\r\n" + 
//				"			\"time\" :\"12-03-2021 17:56:20\",\r\n" + 
//				"			\"odometer\": 4366.1\r\n" + 
//				"		},\r\n" + 
//				"		{\r\n" + 
//				"		\"lat\" :45.5354979,\r\n" + 
//				"		\"lon\" : -122.585499,\r\n" + 
//				"		\"time\" :\"12-03-2021 18:00:43\",\r\n" + 
//				"		\"odometer\": 4376.2\r\n" + 
//				"		},\r\n" + 
//				"		{\r\n" + 
//				"          \"lat\": 45.528548,\r\n" + 
//				"          \"lon\": -122.565871,\r\n" + 
//				"          \"odometer\": 4386.1,\r\n" + 
//				"          \"time\": \"12-03-2021 18:03:19\"\r\n" + 
//				"        },\r\n" + 
//				"		{\r\n" + 
//				"			\"lat\" :45.528548,\r\n" + 
//				"			\"lon\" : -122.565871,\r\n" + 
//				"			\"time\" :\"12-03-2021 18:03:19\",\r\n" + 
//				"			\"odometer\": 4396.1\r\n" + 
//				"		},\r\n" + 
//				"		{\r\n" + 
//				"		\"lat\" :45.519615,\r\n" + 
//				"		\"lon\" : -122.565583,\r\n" + 
//				"		\"time\" :\"12-03-2021 18:05:14\",\r\n" + 
//				"		\"odometer\": 4398.2\r\n" + 
//				"		}\r\n" + 
//				"      ]\r\n" + 
//				"     \r\n" + 
//				"    }\r\n" + 
//				"      ]\r\n" + 
//				"     \r\n" + 
//				"    }\r\n" + 
//				"	";
//		request.header("Authorization","Bearer "+token)
//	.header("Content-Type", "application/json;charset=UTF-8");
//	Response responseFromPostVehicle=request.body(payload).post("/azuga-adx-api/api/vehicles/trips");
//	assertThat(responseFromPostVehicle.statusCode(),is(equalTo(201)));
//	System.out.println("Status Code is "+responseFromPostVehicle.getStatusCode());
//	System.out.println("THE RESPONSE IS AS FOLLOWS "+responseFromPostVehicle);
//	responseFromPostVehicle.prettyPrint();
//	
//	}

//	@Test
//	
//	public void createTripThroughFile() {
//		File jfile =new File ("C:\\Users\\Dell\\eclipse-workspace\\adx\\TripData.csv");
//		RestAssured.baseURI="http://adx-uat.azuga.com";
//        RequestSpecification request = RestAssured.given();
//        
//        request.header("Authorization","Bearer "+token)
//        .multiPart("file",jfile,"multiPart/form-data");
//        //.contentType(ContentType.JSON);
//        Response response=request.body(jfile).post("/azuga-adx-api/api/import/trips");
//        System.out.println("Status Code is "+response.getStatusCode());
//        assertThat(response.statusCode(),is(equalTo(201)));
//		response.prettyPrint();
//		
//		
//	}
	
	
	
}
