package com.smoothstack.dec2020.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "tbl_flight")
@XmlRootElement
public class Flight {
	
	@Column(name = "departtime")
	private LocalDateTime departTime;
	
	@Id
	@Column(name = "flightid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int flightId;
	
	@Column(name = "seatsavailable")
	private int seatsAvailable;
	
	@Column(name = "price")
	private float price;
	
	@Column(name = "departcityid")
	private int departCityId;
	
	@Column(name = "arrivecityid")
	private int arriveCityId;
	
	public Flight() {}

	public Flight(LocalDateTime departTime, int flightId, int seatsAvailable, float price, int departCityId,
			int arriveCityId) {
		super();
		this.departTime = departTime;
		this.flightId = flightId;
		this.seatsAvailable = seatsAvailable;
		this.price = price;
		this.departCityId = departCityId;
		this.arriveCityId = arriveCityId;
	}

	public int getSeatsAvailable() {
		return seatsAvailable;
	}

	public void setSeatsAvailable(int seatsAvailable) {
		this.seatsAvailable = seatsAvailable;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getDepartCityId() {
		return departCityId;
	}

	public void setDepartCityId(int departCityId) {
		this.departCityId = departCityId;
	}

	public int getArriveCityId() {
		return arriveCityId;
	}

	public void setArriveCityId(int arriveCityId) {
		this.arriveCityId = arriveCityId;
	}

	public void setDepartTime(LocalDateTime departTime) {
		this.departTime = departTime;
	}

	public LocalDateTime getDepartTime() {
		return departTime;
	}

	public void setName(LocalDateTime departTime) {
		this.departTime = departTime;
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int authorId) {
		this.flightId = authorId;
	}
}
