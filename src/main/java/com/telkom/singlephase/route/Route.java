package com.telkom.singlephase.route;

import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.RouteBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.telkom.singlephase.processor.BalanceTopUpProcessor;
import com.telkom.singlephase.processor.SinglePhasePinlessRechargeProcessor;


public class Route extends RouteBuilder{

	Logger log = LoggerFactory.getLogger(Route.class);
	@Override
	public void configure() throws Exception {
		
		log.info("=======inside Route =======");
		from("cxfrs://bean://restService").process(new SinglePhasePinlessRechargeProcessor())
		.log(" ==== Sending status to AMQ:BalanceTopUpStatusReq======")
		.removeHeaders("*").removeProperties("*")
		.convertBodyTo(String.class, "UTF-8")
		.to(ExchangePattern.InOnly,"activemq:queue:q_BalanceTopUpStatusReq")
		.log("======Status sent to AMQ:BalanceTopUpStatusReq======")
		.process(new BalanceTopUpProcessor())
		.choice()
			.when()
			.simple("${header.sendToAMQ} == 'True'")
			.to("direct:AMQ")
		.otherwise()
			.to("direct:ManageSubcriberProducProvProcess");
			
			
			
		from("direct:AMQ")
		.log("===== Sendig balanceAdjustment to AMQ:PrepayBalanceManagementReq ======")
		.convertBodyTo(String.class, "UTF-8")
		.removeHeader("sendToAMQ").removeProperties("*")
		.to(ExchangePattern.InOnly,"activemq:queue:q_PrepayBalanceManagementReq")
		.log("======balanceAdjustment sent to AMQ:PrepayBalanceManagementReq======");
		
		from("direct:ManageSubcriberProducProvProcess")
		.log("========== sending to ManageSubcriberProducProvProcess=====")
		.removeHeader("sendToAMQ").removeProperties("*");
		/*.setHeader(Exchange.HTTP_METHOD, constant("POST"))
		.setHeader(Exchange.CONTENT_TYPE, constant("application/json"))
		.to("{{managesubscriberproductentprocess}}");*/
		
		
	}

}
