package com.telkom.singlephase.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.telkom.singlephase.balancetopup.BalanceTopUp;
import com.telkom.singlephase.balancetopup.BalanceTopUpStatus;
import com.telkom.singlephase.balancetopup.BalanceTopUpWrapper;

public class SinglePhasePinlessRechargeProcessor implements Processor {

	ObjectMapper objectMapper = new ObjectMapper();
	Logger log = LoggerFactory.getLogger(SinglePhasePinlessRechargeProcessor.class);
	@Override
	public void process(Exchange exchange) throws Exception {
		
		log.info("=======inside SinglePhasePinlessRechargeProcessor =========");
		log.info("Headers ===="+ exchange.getIn().getHeaders());
		BalanceTopUp balanceTopUp = objectMapper.readValue(exchange.getIn().getBody(String.class), BalanceTopUp.class);
		log.info("======Type is "+ balanceTopUp.getType());
		BalanceTopUpWrapper.BALANCE_TOP_UP = balanceTopUp;
		
		BalanceTopUpStatus balanceTopUpStatus = new BalanceTopUpStatus();
		balanceTopUpStatus.setStatus("Waiting for RechargeCompletion");
		
		exchange.getIn().setBody(balanceTopUpStatus.getStatus());
	}

}
