package com.example.happiewatch.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table(name = "detail")
public class DetailEntity {

    @Id
    private Long id;

    private String material;

    private String image;

    private String features;

    private Float price;

}