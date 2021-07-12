package com.example.demo.ui;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ItemResponseModel {
	private String itemNumber;
	private String itemName;
	private Double itemPrice;
	private Boolean isAvailable;

}
