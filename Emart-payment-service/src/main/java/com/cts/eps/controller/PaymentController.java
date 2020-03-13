package com.cts.eps.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.eps.model.PaymentModel;
import com.cts.eps.service.PaymentService;

@RestController
@CrossOrigin

public class PaymentController {
	
	@Autowired
	PaymentService service;

	@RequestMapping("/payments")
	List<PaymentModel> getAllPayments() {
		return service.getAllPayments(); 
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/payments")
	void addPayment(@RequestBody PaymentModel payment) {
		service.addPayment(payment);
	}
	

	
}
