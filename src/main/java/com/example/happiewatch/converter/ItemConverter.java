package com.example.happiewatch.converter;

import com.example.happiewatch.dto.ItemDto;
import com.example.happiewatch.entity.ItemEntity;
import org.springframework.stereotype.Component;

@Component
public class ItemConverter {
    public ItemEntity toEntity(ItemDto dto) {
        ItemEntity entity = new ItemEntity();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setType(dto.getType());
        entity.setListDetails(dto.getDetail());
        return entity;
    }

    public ItemDto toDTO(ItemEntity entity) {
        ItemDto dto = new ItemDto();
        if (entity.getId() != null) {
            dto.setId(entity.getId());
        }
        dto.setName(entity.getName());
        dto.setType(entity.getType());
        dto.setDetail(entity.getListDetails());
        return dto;
    }

    public ItemEntity toEntity(ItemDto dto, ItemEntity entity) {
        entity.setName(dto.getName());
        entity.setType(dto.getType());
        entity.setListDetails(dto.getDetail());
        return entity;
    }
}
