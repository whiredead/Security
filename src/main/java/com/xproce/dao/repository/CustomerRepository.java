package com.xproce.dao.repository;

import com.xproce.dao.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    List<Customer> findByEmail(String email);
}
