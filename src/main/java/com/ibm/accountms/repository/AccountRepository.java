package com.ibm.accountms.repository;

import com.ibm.accountms.model.Account;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

@Repository
public interface AccountRepository extends MongoRepository<Account, Long> {
    List<Account> findByCustomer(@Param("customer") Long customer);
}
