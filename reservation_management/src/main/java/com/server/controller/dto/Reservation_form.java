package com.server.controller.dto;



public class Reservation_form {
	
	private String name;
	private String mobile_no;
	private String source;
	private String destination;
	public Reservation_form() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reservation_form(String name, String mobile_no, String source, String destination) {
		this.name = name;
		this.mobile_no = mobile_no;
		this.source = source;
		this.destination = destination;
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
