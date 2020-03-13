package com.cts.emart.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.emart.model.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {

}
