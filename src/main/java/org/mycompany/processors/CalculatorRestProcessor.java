package org.mycompany.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import service.co.dhdigital.ws.types.CalculatorRequest;
import service.co.dhdigital.ws.types.CalculatorResponse;
import org.mycompany.services.CalculationService;
public class CalculatorRestProcessor implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		String req = exchange.getIn().getBody(String.class);
		System.out.println("req :"+req);
		/*
		 * CalculatorResponse resp= CalculationService.calculate(req);
		 * exchange.getIn().setBody(resp);
		 */
	}

}
