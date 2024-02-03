package org.as.devtechsolution.accounts.repository;

import org.as.devtechsolution.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Aditya Srivastva on 25-01-2024
 */

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
