package com.ComputerVillageStore.start.persist;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ComputerVillageStore.start.domain.Sale;

public interface SaleRepository extends MongoRepository<Sale,Long>{

}
