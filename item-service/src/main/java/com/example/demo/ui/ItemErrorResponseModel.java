package com.example.demo.ui;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ItemErrorResponseModel {

	private String message;
	private Integer statusCode;
	private Long errorReportingTime;

}
