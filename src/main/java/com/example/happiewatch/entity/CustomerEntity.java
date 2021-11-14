package com.example.happiewatch.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table(name = "customer")
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String address;

    private String telephone;

    private String username;

    private String password;

    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    private Collection<OderEntity> oder;

}
