package com.example.happiewatch.service;

import com.example.happiewatch.dto.OderDto;
import com.example.happiewatch.entity.CustomerEntity;
import com.example.happiewatch.entity.OderEntity;
import com.example.happiewatch.repository.CustomerRepository;
import com.example.happiewatch.repository.OderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OderService implements IOderService{

    @Autowired
    private OderRepository oderRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public OderDto create(OderDto oderDto){
        OderEntity oderEntity =new OderEntity();
        CustomerEntity customer=customerRepository.findOneById(oderDto.getCustomerId());
        oderEntity.setCode(oderDto.getCode());
        oderEntity.setCost(oderDto.getCost());
        oderEntity.setTotal_product(oderDto.getTotal_product());
        oderEntity.setCustomer(customer);
        oderRepository.save(oderEntity);
        return oderDto;
    }

    @Override
    public List<OderEntity> display(){
        return (List<OderEntity>) oderRepository.findAll();
    }

    @Override
    public void delete(String code) {
        OderEntity newEntity=oderRepository.findOneByCode(code);
        oderRepository.delete(newEntity);
    }
}
