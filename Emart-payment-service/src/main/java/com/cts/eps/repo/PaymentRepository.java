package com.cts.eps.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.cts.eps.model.PaymentModel;


public interface PaymentRepository extends CrudRepository<PaymentModel, Integer> {
	Optional<PaymentModel> findById(int cardCode);

}
