package org.mycompany.services;

import service.co.dhdigital.ws.types.CalculatorResponse;

public class CalculationService {

	public static CalculatorResponse calculate(service.co.dhdigital.ws.types.CalculatorRequest request) {
		String operation = request.getOperation();
		double num1 = request.getNum1();
		double num2 = request.getNum2();
		System.out.println("Operation : " + operation);

		double result = 0;
		String remarks = "";
		
		if (operation.equals("sum")) {
			result = num1 + num2;
			remarks = "Sum of num1 and num2 is " + result;
		}else if (operation.equals("minus")) {
			result = num1 - num2;
			remarks = "Minus of num1 and num2 is "+ result;
		}else if (operation.equals("multiply")) {
			result = num1 * num2;
			remarks = "Multiply of num1 and num2 is "+ result;
		}else {
			result = num2 / num2;
			remarks = "Divide of num1 and num2 is "+result;
		}
		CalculatorResponse response = new CalculatorResponse();
		response.setRemarks(remarks);
		response.setResult(result);
		return response;
		
	}
}
