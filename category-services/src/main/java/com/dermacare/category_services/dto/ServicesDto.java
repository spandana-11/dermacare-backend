package com.dermacare.category_services.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ServicesDto {

	private String serviceId;
	private String serviceName;
	private String categoryName;
	private String categoryId;
	private String description;
	private String serviceImage;

}
