package com.example.bike.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bike.models.Bike;

@Repository
public interface BikeRepository extends JpaRepository<Bike, Long> {

}
