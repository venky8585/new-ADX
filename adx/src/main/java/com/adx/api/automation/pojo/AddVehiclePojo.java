package com.adx.api.automation.pojo;

import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.Gson;

public class AddVehiclePojo {
	
	@Override
	public String toString() {
		return "AddVehiclePojo [vin=" + vin + ", nickname=" + nickname + ", year=" + year + ", make=" + make
				+ ", model=" + model + ", trim=" + trim + ", fuel=" + fuel + ", licensePlate=" + licensePlate
				+ ", stateCode=" + stateCode + ", initialOdometer=" + initialOdometer + ", combinedMilesPerGallon="
				+ combinedMilesPerGallon + ", grossWeightRating=" + grossWeightRating + ", engine=" + engine
				+ ", status=" + status + ", registrationDate=" + registrationDate + ", getVin()=" + getVin()
				+ ", getNickname()=" + getNickname() + ", getYear()=" + getYear() + ", getMake()=" + getMake()
				+ ", getModel()=" + getModel() + ", getTrim()=" + getTrim() + ", getFuel()=" + getFuel()
				+ ", getLicensePlate()=" + getLicensePlate() + ", getStateCode()=" + getStateCode()
				+ ", getInitialOdometer()=" + getInitialOdometer() + ", getCombinedMilesPerGallon()="
				+ getCombinedMilesPerGallon() + ", getGrossWeightRating()=" + getGrossWeightRating() + ", getEngine()="
				+ getEngine() + ", getStatus()=" + getStatus() + ", getRegistrationDate()=" + getRegistrationDate()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}


	private String vin;
	private String nickname;
	private int year;
	private String make;
	private String model;
	private String trim;
	private String fuel;
	private String licensePlate;
	private String stateCode;
	private int initialOdometer;
	private int combinedMilesPerGallon;
	private int grossWeightRating;
	private String engine;
	private String status;
	private String registrationDate;

	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getTrim() {
		return trim;
	}
	public void setTrim(String trim) {
		this.trim = trim;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public String getLicensePlate() {
		return licensePlate;
	}
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public int getInitialOdometer() {
		return initialOdometer;
	}
	public void setInitialOdometer(int initialOdometer) {
		this.initialOdometer = initialOdometer;
	}
	public int getCombinedMilesPerGallon() {
		return combinedMilesPerGallon;
	}
	public void setCombinedMilesPerGallon(int combinedMilesPerGallon) {
		this.combinedMilesPerGallon = combinedMilesPerGallon;
	}
	public int getGrossWeightRating() {
		return grossWeightRating;
	}
	public void setGrossWeightRating(int grossWeightRating) {
		this.grossWeightRating = grossWeightRating;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}
	
	
	public JSONObject getSingleVehiclePayLoad (Map<String,String> testData) {
		
		AddVehiclePojo vehicle = new AddVehiclePojo();
		vehicle.setVin(testData.get("vin"));
		vehicle.setNickname(testData.get("nickname"));
		vehicle.setYear(Integer.parseInt(testData.get("year")));
		vehicle.setMake(testData.get("make"));
		vehicle.setModel(testData.get("model"));
		vehicle.setTrim(testData.get("trim"));
		vehicle.setFuel(testData.get("fuel"));
		vehicle.setLicensePlate(testData.get("licensePlate"));
		vehicle.setStateCode(testData.get("stateCode"));
		vehicle.setInitialOdometer(Integer.parseInt(testData.get("initialOdometer")));
		vehicle.setCombinedMilesPerGallon(Integer.parseInt(testData.get("combinedMilesPerGallon")));
		vehicle.setGrossWeightRating(Integer.parseInt(testData.get("grossWeightRating")));
		vehicle.setEngine(testData.get("engine"));	
		vehicle.setStatus(testData.get("status"));
		vehicle.setRegistrationDate(testData.get("registrationDate"));
		
		Gson gson =new Gson();
		//System.out.println("The JSON IS "+gson.toJson(vehicle));
		String stringToParse = gson.toJson(vehicle);
		JSONParser parser = new JSONParser();
		JSONObject json = null;
		try {
			 json = (JSONObject) parser.parse(stringToParse);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}

		return json;
	}
}
