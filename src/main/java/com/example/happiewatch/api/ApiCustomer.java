package com.example.happiewatch.api;

import com.example.happiewatch.dto.CustomerDto;
import com.example.happiewatch.entity.CustomerEntity;
import com.example.happiewatch.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class ApiCustomer {
    @Autowired
    private ICustomerService iCustomerService;

    @PostMapping(value = "/create")
    public CustomerDto createNew(@RequestBody CustomerDto customerDto) {
        return iCustomerService.update(customerDto);
    }

    @PutMapping(value = "/update")
    public CustomerDto update(@RequestBody CustomerDto customerDto) {
        return iCustomerService.update(customerDto);
    }

    @GetMapping(value = "/show")
    public List<CustomerEntity> display(){
        return iCustomerService.display();
    }

    @DeleteMapping(value = "/delete/id={id}")
    public void deleteNew(@PathVariable("id") long id) {
        iCustomerService.delete(id);
    }
}
