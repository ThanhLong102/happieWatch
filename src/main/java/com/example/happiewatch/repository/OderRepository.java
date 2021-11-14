package com.example.happiewatch.repository;

import com.example.happiewatch.entity.OderEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OderRepository extends PagingAndSortingRepository<OderEntity,Long> {

    OderEntity findOneByCode(String code);
}
