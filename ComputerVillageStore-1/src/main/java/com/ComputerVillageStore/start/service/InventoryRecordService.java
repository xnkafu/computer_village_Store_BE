package com.ComputerVillageStore.start.service;

import java.util.List;

import com.ComputerVillageStore.start.domain.InventoryRecord;
import com.ComputerVillageStore.start.domain.Item;

public interface InventoryRecordService {
	
	Item addOneToInventory(Item item);
	List<Item> addManyToInventory(List<Item> items);
	void deleteFromInventory(Long id);
	InventoryRecord updateInventory(Item item);
	List<Item> viewAllInventory();	
}
