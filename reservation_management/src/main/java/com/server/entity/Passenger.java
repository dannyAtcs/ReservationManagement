package com.server.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Passenger {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long passenger_id;
	
	private String name;
	private String mobile_no;
	private String source;
	private String destination;
	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Passenger(Long passenger_id, String name, String mobile_no, String source, String destination) {
		this.passenger_id = passenger_id;
		this.name = name;
		this.mobile_no = mobile_no;
		this.source = source;
		this.destination = destination;
	}
	public Long getPassenger_id() {
		return passenger_id;
	}
	public void setPassenger_id(Long passenger_id) {
		this.passenger_id = passenger_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	
}
