package com.ComputerVillageStore.start.persist;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ComputerVillageStore.start.domain.Employee;

public interface EmployeeRepository extends MongoRepository<Employee,Long>{

}
