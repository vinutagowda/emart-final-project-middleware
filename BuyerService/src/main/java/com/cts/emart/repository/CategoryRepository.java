package com.cts.emart.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.emart.model.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {

}
