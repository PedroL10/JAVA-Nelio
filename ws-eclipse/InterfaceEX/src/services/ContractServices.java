package services;

import java.util.Calendar;
import java.util.Date;

import entities.Contract;
import entities.Installments;

public class ContractServices {
	
	 // Solid - Aberta para extensão mas fechada para alteração- open close principle
	 //private PaypalService paymentService - new PaypalService(); Dessa maneira não é recomendado pois gera um grande acoplamento entre os dois serviços

	private OnlinePaymentService onlinePaymentService;
	
	public ContractServices(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, int months) {
		double basicQuota = contract.getTotalVAlue() / months;
		 for (int  i = 1; i <= months; i++) {
			 double updatedQuota = basicQuota + onlinePaymentService.interest(basicQuota, i);
			 // updatedQuota = 202
			 double fullQouta = updatedQuota + onlinePaymentService.paymentFee(updatedQuota);
			 // fullQouta = 206.04
			 
			 Date dueDAte = addMonths(contract.getDate(), i);
			 contract.getInstallments().add(new Installments(dueDAte, fullQouta));
			 
			 
		 }
	}
	
	private Date addMonths(Date date, int N) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, N);
		return calendar.getTime();
	}

}
