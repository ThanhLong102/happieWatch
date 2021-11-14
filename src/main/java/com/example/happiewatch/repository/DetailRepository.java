package com.example.happiewatch.repository;

import com.example.happiewatch.entity.DetailEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailRepository extends PagingAndSortingRepository<DetailEntity,Long> {

}
