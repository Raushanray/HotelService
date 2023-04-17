package com.lcwr.hotel.repositories;

import com.lcwr.hotel.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel ,String> {
}
