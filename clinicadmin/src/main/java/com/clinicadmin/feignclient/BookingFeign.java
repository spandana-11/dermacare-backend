package com.clinicadmin.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.clinicadmin.dto.BookingResponse;
import com.clinicadmin.dto.ResponseStructure;

@FeignClient(value = "bookingservice")
public interface BookingFeign {

	@GetMapping("/api/v1/getBookedServiceById/{id}")
	public ResponseEntity<ResponseStructure<BookingResponse>> getBookedService(@PathVariable String id);
	
	@PutMapping("/api/v1/updateAppointment")
	public ResponseEntity<?> updateAppointment(@RequestBody BookingResponse bookingResponse );
	

}