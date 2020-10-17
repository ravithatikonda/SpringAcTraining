package com.policy.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.policy.model.Policy;

public interface PolicyRepository extends MongoRepository<Policy, String>{ 

}

