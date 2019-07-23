package com.onetoone;

public class Address {
	private int streetno;
	private String city;
	private String state;
	private Person p;	
	
	
	public Person getP() {
		return p;
	}
	public void setP(Person p) {
		this.p = p;
	}
	public int getStreetno() {
		return streetno;
	}
	public void setStreetno(int streetno) {
		this.streetno = streetno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	

}
