package com.cts.eps.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.eps.repo.PaymentRepository;
import com.cts.eps.model.PaymentModel;


@Service
public class PaymentService {
	@Autowired
	PaymentRepository repo;

	public List<PaymentModel> getAllPayments() {
		

		return (List<PaymentModel>)repo.findAll();
		
	}

	public void addPayment(PaymentModel payment) {
		repo.save(payment);
		
	}

	




	

	



}
