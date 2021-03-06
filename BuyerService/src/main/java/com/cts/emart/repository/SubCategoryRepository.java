package com.cts.emart.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.emart.model.SubCategory;

@Repository
public interface SubCategoryRepository extends CrudRepository<SubCategory, Long> {

}
