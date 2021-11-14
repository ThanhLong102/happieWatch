package com.example.happiewatch.service;

import com.example.happiewatch.dto.OderDto;
import com.example.happiewatch.entity.OderEntity;

import java.util.List;

public interface IOderService {
    OderDto create(OderDto oderDto);

    List<OderEntity> display();

    void delete(String code);
}
