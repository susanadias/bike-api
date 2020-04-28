package com.example.bike.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.example.*;
import com.example.bike.models.Bike;
import com.example.bike.repositories.BikeRepository;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/api/v1/bikes")
public class BikeController {
	
	@Autowired
	private BikeRepository bikeRepository;
	
	@ApiOperation(value = "View a list of available bikes", response = List.class)
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Successfully retrieved list"),
        @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
        @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
        @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
	@GetMapping
	public List<Bike> getBikes() {
		return this.bikeRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	@ApiOperation(value = "Add an bike")
	public void createBike(@ApiParam(value = "Bike object store in database table", required = true) @RequestBody Bike bike) {
		this.bikeRepository.save(bike);
	}
	
	@ApiOperation(value = "Get an bike by Id")
	@GetMapping("/{id}")
	public Bike getBike(@PathVariable("id") long id) {
		return this.bikeRepository.getOne(id);
	}
	

}
