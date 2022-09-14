package com.ComputerVillageStore.start.service;

import java.util.List;

import com.ComputerVillageStore.start.domain.Item;
import com.ComputerVillageStore.start.domain.Sale;

public interface SaleService {
	
	Sale performSale(Item item);
	Sale viewSale(Item item);
	List<Sale> viewAllSale();
	void deleteSale(Long id);
	Sale updateSale(Item item);
	List<Sale> viewMonthlySale(String month);
	List<Sale> viewQuaterySale();
	List<Sale> viewYearlySale(String year);
	
	
}
