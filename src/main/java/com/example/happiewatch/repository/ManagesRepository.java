package com.example.happiewatch.repository;


import com.example.happiewatch.entity.Oder_ItemEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagesRepository extends PagingAndSortingRepository<Oder_ItemEntity,Long> {
    Oder_ItemEntity findOneById(Long id);
}
