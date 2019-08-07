package com.telkom.singlephase.processor;

import java.util.UUID;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.telkom.singlephase.balanceadjustment.PostBalanceAdjustment;
import com.telkom.singlephase.balancetopup.BalanceTopUp;
import com.telkom.singlephase.balancetopup.BalanceTopUpWrapper;
import com.telkom.singlephase.productorder.PostProductOrder;
import com.telkom.singlephase.utility.Mapper;

public class BalanceTopUpProcessor implements Processor {

	ObjectMapper objectMapper = new ObjectMapper();
	Logger logger = LoggerFactory.getLogger(BalanceTopUpProcessor.class);
	@Override
	public void process(Exchange exchange) throws Exception {

		BalanceTopUp balanceTopUp = BalanceTopUpWrapper.BALANCE_TOP_UP;
		String productId= balanceTopUp.getType();
		logger.info("Inside BalanceTopUpProcessor productId is "+productId);
		String requestUUID = UUID.randomUUID().toString();
		
		if("8001891".equalsIgnoreCase(productId))
		{
			PostBalanceAdjustment balanceAdjustment = Mapper.mapFromBalanceTopUpToBalanceAdjustment(balanceTopUp);
			
			exchange.getIn().setHeader("sendToAMQ", "True");
			exchange.getIn().setHeader("notifycustomer", "True");
			exchange.getIn().setHeader("RequestUUID", requestUUID);
			exchange.getIn().setHeader("Requestor", "SinglePhaseRechargeProcess");
			exchange.getIn().setHeader("Target", "Huawei");
			exchange.getIn().setHeader("NextServiceAddress", "http://amazon-manageorder-balancetopupStatusprocess-{env}/prepaybalance/post");
			exchange.getIn().setHeader("SendCustomerNotificationIndicator", "True");
			exchange.getIn().setBody(objectMapper.writeValueAsString(balanceAdjustment));
			
		}else if("8002712".equalsIgnoreCase(productId))
		{
			PostProductOrder productOrder = Mapper.mapFromBalanceTopUpToProductOrder(balanceTopUp);
			exchange.getIn().setHeader("notifycustomer", "True");
			exchange.getIn().setHeader("sendToAMQ", "False");
			exchange.getIn().setHeader("RequestUUID", requestUUID);
			exchange.getIn().setHeader("Requestor", "SinglePhaseRechargeProcess");
			exchange.getIn().setHeader("Target", "Huawei");
			exchange.getIn().setHeader("NextServiceAddress", "http://amazon-manageorder-balancetopupStatusprocess-{env}/prepaybalance/post");
			exchange.getIn().setHeader("SendCustomerNotificationIndicator", "True");
			exchange.getIn().setBody(objectMapper.writeValueAsString(productOrder));
		}
	}

}
