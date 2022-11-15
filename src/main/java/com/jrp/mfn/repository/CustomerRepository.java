package com.jrp.mfn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jrp.mfn.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
