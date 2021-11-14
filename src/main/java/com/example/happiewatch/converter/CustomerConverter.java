package com.example.happiewatch.converter;

import com.example.happiewatch.dto.CustomerDto;
import com.example.happiewatch.entity.CustomerEntity;
import org.springframework.stereotype.Component;

@Component
public class CustomerConverter {
    public CustomerEntity toEntity(CustomerDto dto) {
        CustomerEntity entity = new CustomerEntity();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setTelephone(dto.getTelephone());
        entity.setEmail(dto.getEmail());
        entity.setAddress(dto.getAddress());
        entity.setPassword(dto.getPassword());
        entity.setUsername(dto.getUsername());
        return entity;
    }

    public CustomerDto toDTO(CustomerEntity entity) {
        CustomerDto dto = new CustomerDto();
        if (entity.getId() != null) {
            dto.setId(entity.getId());
        }
        dto.setName(entity.getName());
        dto.setTelephone(entity.getTelephone());
        dto.setEmail(entity.getEmail());
        dto.setAddress(entity.getAddress());
        dto.setUsername(entity.getUsername());
        dto.setPassword(entity.getPassword());
        return dto;
    }

    public CustomerEntity toEntity(CustomerDto dto, CustomerEntity entity) {
        entity.setName(dto.getName());
        entity.setTelephone(dto.getTelephone());
        entity.setEmail(dto.getEmail());
        entity.setAddress(dto.getAddress());
        return entity;
    }
}
