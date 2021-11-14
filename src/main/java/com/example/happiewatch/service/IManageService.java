package com.example.happiewatch.service;

import com.example.happiewatch.dto.ManagesOder;
import com.example.happiewatch.entity.Oder_ItemEntity;

import java.util.List;

public interface IManageService {
    List<Oder_ItemEntity> display();

    ManagesOder update(ManagesOder managesOder);
}
