package com.example.happiewatch.converter;

import com.example.happiewatch.dto.ManagesOder;
import com.example.happiewatch.entity.Oder_ItemEntity;
import org.springframework.stereotype.Component;

@Component
public class MangesConverter {
    public Oder_ItemEntity toEntity(ManagesOder dto) {
        Oder_ItemEntity entity = new Oder_ItemEntity();
        entity.setId(dto.getId());
        entity.setQuantity(dto.getQuantity());
        return entity;
    }

    public ManagesOder toDTO(Oder_ItemEntity entity) {
        ManagesOder dto = new ManagesOder();
        if (entity.getId() != null) {
            dto.setId(entity.getId());
        }
        dto.setQuantity(dto.getQuantity());
        return dto;
    }

    public Oder_ItemEntity toEntity(ManagesOder dto, Oder_ItemEntity entity) {
        entity.setQuantity(dto.getQuantity());
        return entity;
    }
}
