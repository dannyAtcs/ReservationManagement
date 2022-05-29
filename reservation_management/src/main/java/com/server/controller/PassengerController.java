package com.server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.server.controller.dto.Reservation_form;
import com.server.entity.Passenger;
import com.server.entity.Reservation;
import com.server.service.PassengerService;

@RestController
@RequestMapping("/passenger")
public class PassengerController {
	
	@Autowired
	private PassengerService passengerService;
	
	@PostMapping("/post")
	public String BookReservation(@RequestBody Reservation_form reservationform)
	{
		return passengerService.BookReservation(reservationform);
	}
	
	@GetMapping("/getall")
	public List<Passenger> getAll()
	{
		return passengerService.getAll();
		
	}
	
	@GetMapping("/getallreservation")
	public List<Reservation> getAllReservation()
	{
		return passengerService.getAllReservation();
		
	}
	
	@GetMapping("/{id}")
	public Passenger getPassengerByid(@PathVariable("id") Long passenger_id)
	{
		return passengerService.getPassengerById(passenger_id);
		
	}

	@PutMapping("/put")
	public Passenger update(@RequestBody Passenger passenger)
	{
		return passengerService.update(passenger);
		
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long passenger_id)
	{
		passengerService.delete(passenger_id);
	}
}
