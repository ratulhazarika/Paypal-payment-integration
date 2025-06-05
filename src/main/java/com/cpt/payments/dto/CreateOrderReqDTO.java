package com.cpt.payments.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
//we can also use noArgConstructor allArgContructor annotation for constructor wjth all arg and with no arg
public class CreateOrderReqDTO {

	//payment proccessing service should give all these data to this provider service
	private String txnRef;

	private String currencycode;
	private String amountValue;
	private String brndName;
	private String locale;
	private String returnUrl;
	private String cancelUrl;
	
}
