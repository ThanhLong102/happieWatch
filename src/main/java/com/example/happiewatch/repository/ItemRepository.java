package com.example.happiewatch.repository;

import com.example.happiewatch.entity.ItemEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends PagingAndSortingRepository<ItemEntity,Long> {

    ItemEntity findOneById(Long id);
}
