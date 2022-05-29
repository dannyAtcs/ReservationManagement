package com.server.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.server.entity.Passenger;

@Repository
public interface PassengerRepo extends JpaRepository<Passenger, Long>{

}
