//<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >
package com.adx.api.automation.utils;

import java.util.Map;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.config.EncoderConfig;
import io.restassured.response.Response;

public class RestUtils {

	public Response get(String url) {
		return RestAssured.given()
		.header("Authorization","Bearer")
		.header("Content-Type","application/json")
		.log().all()
		.get(url);
	}
	
	public Response getWithParam(String url,Map <String, String> map ) {
		return RestAssured.given()
				.queryParams(map)
				.header("Content-Type", "application/json")
				.header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdWQiOlsicmVzb3VyY2VfaWQiXSwidXNlcl9uYW1lIjoidmVua2F0ZXNobCswMDJAYXp1Z2EuY29tIiwic2NvcGUiOlsicmVhZCIsIndyaXRlIl0sImV4cCI6MTY2MjkzMzMxOCwiYXV0aG9yaXRpZXMiOlsiT1dORVIiXSwianRpIjoiY2U0ZDE1YWMtN2NmMC00M2ZlLWI1OTQtMjk1Mjg5ZTA4NzIwIiwiY2xpZW50X2lkIjoiMSJ9.7H_h3IcAzcSgRDciUvp6U3gaQLNqAGbvIExxpr0bA2Y")
		.header("Authorization","Bearer")
		.header("Content-Type","application/json")
		.log().all()
		.get(url);
    }
	
	public Response createSingleVehicle(String url,JSONObject body1 ) {
		
		//RestAssuredConfig decodeCharset=RestAssured.config().encoderConfig(EncoderConfig.encoderConfig().appendDefaultContentCharsetToContentTypeIfUndefined(false));
	
		return RestAssured.given()
				
				//.baseUri("http://adx-uat.azuga.com/azuga-adx-api/api")
				.header("Authorization","Bearer "+"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdWQiOlsicmVzb3VyY2VfaWQiXSwidXNlcl9uYW1lIjoidmVua2F0ZXNobCswMDFAYXp1Z2EuY29tIiwic2NvcGUiOlsicmVhZCIsIndyaXRlIl0sImV4cCI6MTY2MjQwMjIzNCwiYXV0aG9yaXRpZXMiOlsiT1dORVIiXSwianRpIjoiNWVkZTVlMTYtZjhhMS00MDY1LTk4NzktZjY4NmI5Y2FiNWVkIiwiY2xpZW50X2lkIjoiMSJ9.iz6B30MjSEwnsEuCYAnmdJ1YBmtoXctBW_WLJf6FiGk")
				
				//.header("Content-Type", "application/json;charset=UTF-8")
				//.header("Accept", "*/*")
				//.contentType("application/json")
				.log().all()
				//.config(RestAssured.config().encoderConfig(EncoderConfig.encoderConfig().appendDefaultContentCharsetToContentTypeIfUndefined(false))).contentType("application/json")
				 .config(RestAssured.config().encoderConfig(EncoderConfig.encoderConfig().appendDefaultContentCharsetToContentTypeIfUndefined(false))).
				 contentType("application/json")
				.body(body1)
		        .post(url);
    }
	
	public Response createVehicle(String url,String body ) {
		return RestAssured.given()
				.body(body)
				.baseUri("http://adx-uat.azuga.com/azuga-adx-api/api")
				.header("Authorization","Bearer "+"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdWQiOlsicmVzb3VyY2VfaWQiXSwidXNlcl9uYW1lIjoidmVua2F0ZXNobCswMDFAYXp1Z2EuY29tIiwic2NvcGUiOlsicmVhZCIsIndyaXRlIl0sImV4cCI6MTY2MjQwMjIzNCwiYXV0aG9yaXRpZXMiOlsiT1dORVIiXSwianRpIjoiNWVkZTVlMTYtZjhhMS00MDY1LTk4NzktZjY4NmI5Y2FiNWVkIiwiY2xpZW50X2lkIjoiMSJ9.iz6B30MjSEwnsEuCYAnmdJ1YBmtoXctBW_WLJf6FiGk")
				.contentType("application/json")
				.log().all()
		        .post("/azuga-adx-api/api/vehicles");
    }
	
}
