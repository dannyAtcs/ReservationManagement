package com.server.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long reservation_id;
	
	private int fare;
	
	private Long passenger_id;

	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reservation(Long reservation_id, int fare, Long passenger_id) {
		this.reservation_id = reservation_id;
		this.fare = fare;
		this.passenger_id = passenger_id;
	}

	public Long getReservation_id() {
		return reservation_id;
	}

	public void setReservation_id(Long reservation_id) {
		this.reservation_id = reservation_id;
	}

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}

	public Long getPassenger_id() {
		return passenger_id;
	}

	public void setPassenger_id(Long passenger_id) {
		this.passenger_id = passenger_id;
	}
	
	
	
	
}
