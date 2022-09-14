package com.ComputerVillageStore.start.persist;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ComputerVillageStore.start.domain.Address;

public interface AddressRepository extends MongoRepository<Address,Long> {

}
