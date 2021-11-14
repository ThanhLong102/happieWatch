package com.example.happiewatch.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class ManagesOder {

    private Long id;

    private Long quantity;

    private Long itemId;

    private String code;
}
