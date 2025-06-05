package com.cpt.payments.service.impl;

import com.cpt.payments.dto.CreateOrderReqDTO;
import com.cpt.payments.dto.OrderDTO;
import com.cpt.payments.service.interfaces.PaymentService;

public class PaymentServiceImpl implements PaymentService{
	
	@Override
	public OrderDTO createOrder(CreateOrderReqDTO createOrderReqDTO) {

		System.out.println("Creating order for "
				+ "createOrderReqDTO: " + createOrderReqDTO);

}

	
	