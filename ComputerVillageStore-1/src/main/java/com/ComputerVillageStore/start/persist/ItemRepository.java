package com.ComputerVillageStore.start.persist;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ComputerVillageStore.start.domain.Item;


public interface ItemRepository extends MongoRepository<Item,Long>{

}

