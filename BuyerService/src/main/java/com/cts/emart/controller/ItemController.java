package com.cts.emart.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.emart.model.Item;

import com.cts.emart.model.SubCategory;
import com.cts.emart.service.ItemService;

@RestController
@CrossOrigin("http://localhost:4200")

@RequestMapping("/item")
public class ItemController {

	@Autowired
	private ItemService service;

	@RequestMapping("/all")
	List<Item> getAll() {
		return service.getItems();
	}

	@RequestMapping("/{itemId}")
	Optional<Item> getById(@PathVariable Long itemId) {
		return service.getItemById(itemId);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/{subCategoryId}")
	void addItem(@RequestBody Item item, @PathVariable Long subCategoryId) {
		
		item.setSubCategory(new SubCategory(subCategoryId));
		service.addItem(item);
		
//		if (LocalDate.now().isAfter(item.getDiscount().getStartDate())
//				&& LocalDate.now().isBefore(item.getDiscount().getEndDate())) {
//			double sPrice = item.getMarkedPrice() - (item.getDiscount().getPercent() / 100) * item.getMarkedPrice();
//			item.setSellingPrice(sPrice);
//		} else
//			item.setSellingPrice(item.getMarkedPrice());
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/{itemId}")
	void deleteCategoryById(@PathVariable Long itemId) {
		service.deleteItem(itemId);
	}

	@RequestMapping(method = RequestMethod.PUT)
	void updateItem(@RequestBody Item item) {
		service.updateItem(item);
	}
}
