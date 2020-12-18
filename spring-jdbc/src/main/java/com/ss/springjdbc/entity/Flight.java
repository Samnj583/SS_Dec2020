/**
 * 
 */
package com.ss.springjdbc.entity;

/**
 * @author 
 *
 */
public class Flight {
	
	int flightId;
	String departTime;
//	private int seatsAvailable;
//	private float price;
//	private int departCityId;
//	private int arriveCityId;
	

	public Flight(String departTime, int flightId) {
		this.departTime = departTime;
		this.flightId = flightId;	
		}

	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getDepartTime() {
		return departTime;
	}
	public void setDepartTime(String departTime) {
		this.departTime = departTime;
	}
//	public int getSeatsAvailable() {
//		return seatsAvailable;
//	}
//	public void setSeatsAvailable(int seatsAvailable) {
//		this.seatsAvailable = seatsAvailable;
//	}
//	public float getPrice() {
//		return price;
//	}
//	public void setPrice(float price) {
//		this.price = price;
//	}
//	public int getDepartCityId() {
//		return departCityId;
//	}
//	public void setDepartCityId(int departCityId) {
//		this.departCityId = departCityId;
//	}
//	public int getArriveCityId() {
//		return arriveCityId;
//	}
//	public void setArriveCityId(int arriveCityId) {
//		this.arriveCityId = arriveCityId;
//	}

	
}
