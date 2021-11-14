package com.example.happiewatch.service;

import com.example.happiewatch.dto.CustomerDto;
import com.example.happiewatch.entity.CustomerEntity;

import java.util.List;

public interface ICustomerService {
    List<CustomerEntity> display();

    CustomerDto update(CustomerDto customerDto);

    void delete(long id);
}
