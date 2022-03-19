package com.adx.api.automation.pojo;

import java.util.HashMap;
import java.util.Map;


import javax.annotation.processing.Generated;



@Generated("jsonschema2pojo")
public class AddVehicleNewPojo {


private String vin;

private String nickname;

private Integer year;

private String make;

private String model;

private String trim;

private String fuel;

private String licensePlate;

private String stateCode;

private Integer initialOdometer;

private Integer combinedMilesPerGallon;

private Integer grossWeightRating;

private String engine;

private String status;

private String registrationDate;

private Map<String, Object> additionalProperties = new HashMap<String, Object>();


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


public Integer getYear() {
return year;
}


public void setYear(Integer year) {
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


public Integer getInitialOdometer() {
return initialOdometer;
}


public void setInitialOdometer(Integer initialOdometer) {
this.initialOdometer = initialOdometer;
}


public Integer getCombinedMilesPerGallon() {
return combinedMilesPerGallon;
}


public void setCombinedMilesPerGallon(Integer combinedMilesPerGallon) {
this.combinedMilesPerGallon = combinedMilesPerGallon;
}


public Integer getGrossWeightRating() {
return grossWeightRating;
}


public void setGrossWeightRating(Integer grossWeightRating) {
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


public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}


public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}