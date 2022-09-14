package com.ComputerVillageStore.start.persist;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ComputerVillageStore.start.domain.ItemBrand;

public interface ItemBrandRepository extends MongoRepository<ItemBrand,Long>{

}
