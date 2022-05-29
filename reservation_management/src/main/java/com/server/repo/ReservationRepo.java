package com.server.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.server.entity.Reservation;


@Repository
public interface ReservationRepo extends JpaRepository<Reservation, Long> {

}
