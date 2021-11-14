package com.example.happiewatch.dto;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class OderDto {

    private String code;

    private Long customerId;

    private Float cost;

    private Long total_product;
}
