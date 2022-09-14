package com.ComputerVillageStore.start.persist;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ComputerVillageStore.start.domain.ItemType;

public interface ItemTypeRepository extends MongoRepository<ItemType,Long>{

}
