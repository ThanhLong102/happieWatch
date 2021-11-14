package com.example.happiewatch.service;

import com.example.happiewatch.converter.CustomerConverter;
import com.example.happiewatch.dto.CustomerDto;
import com.example.happiewatch.entity.CustomerEntity;
import com.example.happiewatch.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustmerService implements ICustomerService{
    @Autowired
    private CustomerConverter customerConverter;

    @Autowired
    private CustomerRepository customerRepository;


    @Override
    public List<CustomerEntity> display(){
        return (List<CustomerEntity>) customerRepository.findAll();
    }

    @Override
    public CustomerDto update(CustomerDto customerDto){
        CustomerEntity customerEntity =new CustomerEntity();
        if (customerDto.getId() != null) {
            CustomerEntity oldCustomer = customerRepository.findOneById(customerDto.getId());
            customerEntity = customerConverter.toEntity(customerDto, oldCustomer);
        } else {
            customerEntity = customerConverter.toEntity(customerDto);
        }
        customerEntity = customerRepository.save(customerEntity);
        return customerConverter.toDTO(customerEntity);
    }

    @Override
    public void delete(long id) {
        CustomerEntity newEntity=customerRepository.findOneById(id);
        customerRepository.delete(newEntity);
    }
}
