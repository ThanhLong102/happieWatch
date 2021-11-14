package com.example.happiewatch.dto;

import com.example.happiewatch.entity.DetailEntity;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Collection;

@Getter
@Setter
@RequiredArgsConstructor
public class ItemDto {

    private Long id;

    private String name;

    private String type;

    private Collection<DetailEntity> detail;
}
