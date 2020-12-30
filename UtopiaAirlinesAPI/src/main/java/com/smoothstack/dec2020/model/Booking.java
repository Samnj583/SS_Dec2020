package com.smoothstack.dec2020.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "tbl_booking")
@XmlRootElement
public class Booking {
	
	@Id
	@Column(name = "bookingid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookingId;
	
	@Column(name = "flightid")
	private int flightId;
	
	@Column(name = "isactive")
	private int isActive;
	
	@Column(name = "stripeid")
	private String stripeId;
	
	@Column(name = "bookerid")
	private int bookerId;
	
	public Booking() {}
	
	public Booking(int bookingId, int flightId, int isActive, String stripeId, int bookerId) {
		super();
		this.bookingId = bookingId;
		this.flightId = flightId;
		this.isActive = isActive;
		this.stripeId = stripeId;
		this.bookerId = bookerId;
	}
	
	public int getBookingId() {
		return bookingId;
	}
	
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	
	public int getFlightId() {
		return flightId;
	}
	
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	
	public int getIsActive() {
		return isActive;
	}
	
	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}
	
	public String getStripeId() {
		return stripeId;
	}
	
	public void setStripeId(String stripeId) {
		this.stripeId = stripeId;
	}
	
	public int getBookerId() {
		return bookerId;
	}
	
//	public void setBookerId(int bookerId) {
//		this.bookerId = bookerId;
//	}

}
