package com.company.spaceflights.repository;

import com.company.spaceflights.model.Tourist;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TouristRepository extends CrudRepository<Tourist,Long> {

}
