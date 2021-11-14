package com.example.happiewatch.repository;

import com.example.happiewatch.entity.CustomerEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends PagingAndSortingRepository<CustomerEntity,Long> {

    CustomerEntity findOneById(Long id);
}
