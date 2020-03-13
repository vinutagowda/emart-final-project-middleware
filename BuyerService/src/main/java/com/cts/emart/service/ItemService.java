package com.cts.emart.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.emart.model.Item;
import com.cts.emart.repository.ItemRepository;

@Service
public class ItemService {

	@Autowired
	private ItemRepository repo;

	public List<Item> getItems() {
		return (List<Item>) repo.findAll();
	}

	public Optional<Item> getItemById(Long itemId) {
		return repo.findById(itemId);
	}

	public void addItem(Item item) {
		repo.save(item);
		
	}

	public void deleteItem(Long itemId) {
		repo.deleteById(itemId);
		
	}

	public void updateItem(Item item) {
		repo.save(item);
		
	}

}
