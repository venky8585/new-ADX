package com.adx.api.automation.adx;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.adx.api.automation.pojo.AddVehicleNewPojo;
import com.adx.api.automation.pojo.AddVehiclePojo;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class AdxTestHighLevel {
	
	String vinValue="5TETU22N26Z168012";
	String LicensePlate="80g1";
	
	RequestSpecification requestSpecification;
	ResponseSpecification responseSpecification;
	
	@BeforeClass
	
	public void setRequestAndResponseSpecBuilders() {
		
		RequestSpecBuilder setReqSpecBuilder=new RequestSpecBuilder();
				setReqSpecBuilder.setBaseUri("http://adx-uat.azuga.com");
				setReqSpecBuilder.setBasePath("/azuga-adx-api/api");
				setReqSpecBuilder.addHeader("Authorization","Bearer "+"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdWQiOlsicmVzb3VyY2VfaWQiXSwidXNlcl9uYW1lIjoidmVua2F0ZXNobCswMDFAYXp1Z2EuY29tIiwic2NvcGUiOlsicmVhZCIsIndyaXRlIl0sImV4cCI6MTY2MjQwMjIzNCwiYXV0aG9yaXRpZXMiOlsiT1dORVIiXSwianRpIjoiNWVkZTVlMTYtZjhhMS00MDY1LTk4NzktZjY4NmI5Y2FiNWVkIiwiY2xpZW50X2lkIjoiMSJ9.iz6B30MjSEwnsEuCYAnmdJ1YBmtoXctBW_WLJf6FiGk");
				setReqSpecBuilder.addHeader("Content-Type", "application/json;charset=UTF-8");
				setReqSpecBuilder.setContentType(ContentType.JSON);
				//addHeader("Content-Type", "application/json;charset=UTF-8").
				setReqSpecBuilder.log(LogDetail.ALL);
		
		requestSpecification = setReqSpecBuilder.build();
		
	}

	@Test
	
	public void CreateVehicle () {
		
		AddVehicleNewPojo addVehicle =new AddVehicleNewPojo();
		
		
		addVehicle.setVin("TRUHF38J991018168");
     	addVehicle.setNickname("SUV");
     	addVehicle.setYear(2018);
     	addVehicle.setMake("Honda");
     	addVehicle.setModel("Civic");
     	addVehicle.setTrim("trim");
     	addVehicle.setFuel("Gasonline");
     	addVehicle.setLicensePlate("hg-11");
     	addVehicle.setStateCode("OR");
     	addVehicle.setInitialOdometer(8);
     	addVehicle.setCombinedMilesPerGallon(3);
     	addVehicle.setGrossWeightRating(20);
     	addVehicle.setEngine("engineType");
     	addVehicle.setStatus("Active");
     	addVehicle.setRegistrationDate("2022-03-15");
		
		
		
		Response response=given(requestSpecification).
				body(addVehicle).
				post("/vehicles").
				then().log().all().extract().response();
		System.out.println(response.asPrettyString());
		assertThat(response.statusCode(),is(equalTo(200)));
		
	}
}
