package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ItemDto {
	private String itemNumber;
	private String itemName;
	private Double itemPrice;
	private Boolean isAvailable;

}
