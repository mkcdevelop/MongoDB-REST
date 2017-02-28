package com.hello;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "cust", path = "cust")
public interface CustomerRepository extends MongoRepository<Customer, String> {

	List<Customer> findByLastName(@Param("name") String name);
}
