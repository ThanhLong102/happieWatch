package com.example.happiewatch.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table(name = "oder_item")
public class Oder_ItemEntity {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    private Long quantity;

    @ManyToOne
    @JoinColumn(name="item_id",referencedColumnName = "id")
    private ItemEntity item;

    @ManyToOne
    @JoinColumn(name="oder_code",referencedColumnName = "code")
    @JsonIgnore
    private OderEntity oder;
}
