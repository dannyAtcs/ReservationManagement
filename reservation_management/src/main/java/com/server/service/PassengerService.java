package com.server.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.server.controller.dto.Reservation_form;
import com.server.entity.Passenger;
import com.server.entity.Reservation;
import com.server.repo.PassengerRepo;
import com.server.repo.ReservationRepo;

@Service
public class PassengerService {

	
	
	@Autowired
	private PassengerRepo passengerRepo;
	
	@Autowired
	private ReservationRepo reservationRepo;
	
	
	//POST
	public String BookReservation(Reservation_form reservationform)
	{
		Passenger passenger = new ObjectMapper().convertValue(reservationform, Passenger.class);
		
		Long passenger_id = passengerRepo.save(passenger).getPassenger_id();
		
		System.out.println("passenger Details received successfully");
		
		Reservation reservation = new Reservation(1234L, 300, passenger_id);
		
		Long reservation_id = reservationRepo.save(reservation).getReservation_id();
		
		return "Reservation Number : " + reservation_id;
		
	}
	
	//GetAllPassenger
	public List<Passenger> getAll()
	{
		return passengerRepo.findAll();
		
	}
	
	//GetAllReservation
	public List<Reservation> getAllReservation()
	{
		return reservationRepo.findAll();
			
	}
	
	//getpassengerbyid
	public Passenger getPassengerById(Long passenger_id)
	{
		return passengerRepo.findById(passenger_id).get();
		
	}
	
	//update
	public Passenger update(Passenger passenger)
	{
		return passengerRepo.save(passenger);
	
	}
	
	//delete 
	public String delete(Long passenger_id)
	{
		
		passengerRepo.deleteById(passenger_id);
		return "Passenger deleted successfully";
		
	}
}