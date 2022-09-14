package com.ComputerVillageStore.start.persist;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface InventoryRecordRepository extends MongoRepository<InventoryRecordRepository,Long>{

}