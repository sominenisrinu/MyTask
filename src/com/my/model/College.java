package com.my.model;

public class College {
	
	private String code;
	private String Name;
	private String address;
	private String city;
	private String state;
	private String postcode;
	
	public String getCode(){
		return code;
	}
	public void setCode(String code){
		this.code=code;
	}
	public String getName(){
		return Name;
	}
	public void setName(String Name){
		this.Name=Name;
	}
	public String getAddress(){
		return address;
	}
	public void setAddress(String address){
		this.address=address;
	}
	public String getCity(){
		return city;
	}
	public void setCity(String city){
		this.city=city;
	}
	public String getState(){
		return state;
	}
	public void setState(String state){
		this.state=state;
	}
	public String getPostCode(){
		return postcode;
	}
	public void setPostCode(String postcode){
		this.postcode=postcode;
	}
}
