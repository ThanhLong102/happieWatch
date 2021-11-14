package com.example.happiewatch.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class CustomerDto {

    private Long id;

    private String name;

    private String email;

    private String address;

    private String telephone;

    private String password;

    private String username;
}
