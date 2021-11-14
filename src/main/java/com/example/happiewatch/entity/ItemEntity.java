package com.example.happiewatch.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table(name="item")
public class ItemEntity {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String type;

    @OneToMany(fetch = FetchType.LAZY,targetEntity = DetailEntity.class,cascade = CascadeType.ALL)
    @JoinColumn(name="item",referencedColumnName = "id")
    private Collection<DetailEntity> listDetails;

    @OneToMany(mappedBy = "item", cascade = CascadeType.ALL)
    @JsonIgnore
    private Collection<Oder_ItemEntity> oder_itemEntityCollection;


}

