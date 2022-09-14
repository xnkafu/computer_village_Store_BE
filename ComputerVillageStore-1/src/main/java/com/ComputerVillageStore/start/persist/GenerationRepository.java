package com.ComputerVillageStore.start.persist;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ComputerVillageStore.start.domain.Generation;

public interface GenerationRepository extends MongoRepository<Generation,Long>{

}
