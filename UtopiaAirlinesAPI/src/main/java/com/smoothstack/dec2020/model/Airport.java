package com.smoothstack.dec2020.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "tbl_airport")
@XmlRootElement
public class Airport implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "airportid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int airportId;
	
	@Column(name = "city")
	private String city;
	
	public Airport() {}
	
	public Airport(int airportId, String city) {
		super();
		this.airportId = airportId;
		this.city = city;
	}
	
	public int getAirportId() {
		return airportId;
	}
	
	public void setAirportId(int airportId) {
		this.airportId = airportId;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
}
