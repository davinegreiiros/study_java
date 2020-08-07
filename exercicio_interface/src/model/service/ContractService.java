	package model.service;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	
	private ServicePayment paymentService;
	

	public ContractService(ServicePayment paymentService) {
		this.paymentService = paymentService;
	}
	
	public void processContract(Contract contract, int months) {
		double basicQuota = contract.getTotalValue() / months;
		
		for(int i = 1; i<= months; i++) {
			double updatedQuota = basicQuota + paymentService.interest(basicQuota, i);
		
			double fullQuota = updatedQuota + paymentService.paymentFee(updatedQuota);
			
			Date dueDate = addMonths(contract.getDate(), i);
			contract.getInstallments().add(new Installment(dueDate, fullQuota));
		}
	}
	
	private Date addMonths(Date date, int n) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, n);
		return calendar.getTime();
		
		
	}
}
