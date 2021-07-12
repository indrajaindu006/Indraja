package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.ItemDto;
import com.example.demo.ui.ItemResponseModel;

public interface ItemService<ItemResponeModel> {
	public ItemResponseModel createItem(ItemDto itemDto);

	public List<ItemResponeModel> getAllItems();

	public ItemResponseModel findByItemNumber(String itemNumber);

	public List<ItemResponseModel> findByItemName(String itemName);
}
