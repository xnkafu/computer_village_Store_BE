package com.ComputerVillageStore.start.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.ComputerVillageStore.start.domain.InventoryRecord;
import com.ComputerVillageStore.start.domain.Item;
import com.ComputerVillageStore.start.persist.InventoryRecordRepository;
import com.ComputerVillageStore.start.persist.ItemRepository;
import com.ComputerVillageStore.start.service.InventoryRecordService;

public class InventoryRecordServiceImpl implements InventoryRecordService {
	
	@Autowired private InventoryRecordRepository inventoryRepo;
	
	@Autowired private ItemRepository itemRepo;
		
	@Override
	@Transactional
	public Item addToInventory(Item item) {
		itemRepo.findOne(item)	;
		return null;	
	}
		
	
	@Override
	public void deleteFromInventory(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public InventoryRecord updateInventory(Item item) {
		// TODO Auto-generated method stub
		return null	;
	}
				
	@Override
	public List<Item> viewAllInventory() {
		// TODO Auto-generated method stub
		return null;
	}
}
