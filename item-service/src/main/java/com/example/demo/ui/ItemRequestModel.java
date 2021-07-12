package com.example.demo.ui;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ItemRequestModel {
	private String itemName;
	private Double itemPrice;
	private Boolean isAvailable;

}
