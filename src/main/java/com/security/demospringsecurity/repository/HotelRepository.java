package com.security.demospringsecurity.repository;

import com.security.demospringsecurity.model.Hotel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends PagingAndSortingRepository<Hotel,Long> {
}
