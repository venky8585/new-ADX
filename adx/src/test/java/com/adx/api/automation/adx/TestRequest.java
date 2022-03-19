package com.adx.api.automation.adx;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.adx.api.automation.pojo.AddVehiclePojo;
import com.adx.api.automation.utils.RestUtils;

import io.restassured.response.Response;


public class TestRequest {

	String vinValue="5TETU22N26Z168012";
	String LicensePlate="80-gg-11";
	
	
	@Test
	public void addSingleVehicle () {
		String AddVehurl="http://adx-uat.azuga.com/azuga-adx-api/api/vehicles";
		
		AddVehiclePojo addVehicle =new AddVehiclePojo();
		RestUtils util=new RestUtils();
		Map<String,String> testVehData= new HashMap<String,String>();
		
		testVehData.put("vin", "JN8DR09Y33W823690");
		testVehData.put("nickname", "LKI");
		testVehData.put("year", "2011");
		testVehData.put("make", "ford");
		testVehData.put("model", "Spark");
		testVehData.put("trim", "KT");
		testVehData.put("fuel", "Gasol");
		testVehData.put("licensePlate", "ro-yy");
		testVehData.put("stateCode", "OR");
		testVehData.put("initialOdometer", "876");
		testVehData.put("combinedMilesPerGallon", "29");
		testVehData.put("grossWeightRating", "10");
		testVehData.put("engine", "engineType");
		testVehData.put("status", "Active");
		testVehData.put("registrationDate", "2022-03-14");
		
		
		JSONObject vehPayload = addVehicle.getSingleVehiclePayLoad(testVehData);
		
		//System.out.println("The Final Payload is "+vehPayload);

		Response response =util.createSingleVehicle(AddVehurl,vehPayload);
		//System.out.println("THE RETURNED DATA "+addVehicle.getSingleVehiclePayLoad(testVehData));
		//Response response =util.createSingleVehicle(AddVehurl,addVehicle.getSingleVehiclePayLoad(testVehData));
		
	System.out.println(response.prettyPrint());	
		
		
	}

//	
	
//	@Test 
//	
//	public void CreateASingleVehicle () {
//		
//		RestAssured.baseURI="http://adx-uat.azuga.com";
//		RequestSpecification request = RestAssured.given();
//		
//		String payload ="{\r\n" + 
//				"    \"vin\": \"JTDKB22U640054200\",   \r\n" + 
//				"    \"nickname\": \"RDE\",\r\n" + 
//				"    \"year\": 2020,\r\n" + 
//				"    \"make\": \"make\",\r\n" + 
//				"    \"model\": \"model\",\r\n" + 
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
//		request.header("Authorization","Bearer "+"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdWQiOlsicmVzb3VyY2VfaWQiXSwidXNlcl9uYW1lIjoidmVua2F0ZXNobCswMDFAYXp1Z2EuY29tIiwic2NvcGUiOlsicmVhZCIsIndyaXRlIl0sImV4cCI6MTY2MjQwMjIzNCwiYXV0aG9yaXRpZXMiOlsiT1dORVIiXSwianRpIjoiNWVkZTVlMTYtZjhhMS00MDY1LTk4NzktZjY4NmI5Y2FiNWVkIiwiY2xpZW50X2lkIjoiMSJ9.iz6B30MjSEwnsEuCYAnmdJ1YBmtoXctBW_WLJf6FiGk")
//	.header("Content-Type", "application/json;charset=UTF-8");
//	Response responseFromPostVehicle=request.body(payload).post("/azuga-adx-api/api/vehicles");
//	assertThat(responseFromPostVehicle.statusCode(),is(equalTo(201)));
//	System.out.println("THE RESPONSE IS AS FOLLOWS "+responseFromPostVehicle);
////	String OutputOrganizationId=responseFromPostVehicle.path("content[0].id");
////	System.out.println("The Organization ID of the added Vehicle is "+ OutputOrganizationId);
//
//	responseFromPostVehicle.prettyPrint();
//	}
//	
//	
	
//	@Test
//	
//	public void getVinDetails() {
//	Map<String,String> testData= new HashMap<String,String>();
//		
//		//String url="http://adx-uat.azuga.com/azuga-adx-api/api/vehicles";
//		String url="http://adx-uat.azuga.com/azuga-adx-api/api/vehicles-search";
//		String vin="JTDKB22U640054200";
//		RestUtils util=new RestUtils();
//		Response response =util.getWithParam(url, testData);
//		response.prettyPrint();
//		System.out.println("THE VEHICLE DETAILS IS AS FOLLOWS "+response);
//	}
	
//	@Test
//	public void addSingleVehicle () {
//		
//		RestAssured.baseURI="http://adx-uat.azuga.com";
//     	RequestSpecification request = RestAssured.given();
//		
//     	String AddVehurl="http://adx-uat.azuga.com/azuga-adx-api/api/vehicles";
//	
//		AddVehiclePojo addVehicle =new AddVehiclePojo();
//     	RestUtils util=new RestUtils();
//     	
//     	addVehicle.setVin(vinValue);
//     	addVehicle.setNickname("astar");
//     	addVehicle.setYear(2018);
//     	addVehicle.setMake("Honda");
//     	addVehicle.setModel("Civic");
//     	addVehicle.setTrim("4Plus4");
//     	addVehicle.setFuel("Gasonline");
//     	addVehicle.setLicensePlate(LicensePlate);
//     	addVehicle.setStateCode("OR");
//     	addVehicle.setInitialOdometer(800);
//     	addVehicle.setCombinedMilesPerGallon(23);
//     	addVehicle.setGrossWeightRating(20);
//     	addVehicle.setEngine("Engine");
//     	addVehicle.setStatus("Active");
//     	addVehicle.setRegistrationDate("2022-03-15");
//     	

     	//Response response =util.createSingleVehicle(AddVehurl,addVehicle);
     	//response.prettyPrint();
     	
 
	}


