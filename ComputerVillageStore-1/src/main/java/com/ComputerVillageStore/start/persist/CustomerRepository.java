package com.ComputerVillageStore.start.persist;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ComputerVillageStore.start.domain.Customer;

public interface CustomerRepository extends MongoRepository<Customer, Long> {

}
 