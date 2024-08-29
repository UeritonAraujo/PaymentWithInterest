package services;

import java.time.LocalDate;

import entities.Contract;
import entities.Installment;

public class ContractService {
	
	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, int months) {
		
		double basicQuota = contract.getTotalValue() / months;
		
		for (int i = 1; i <= months; i++) {										// Criar um for para percorrer os meses
			LocalDate dueDate = contract.getDate().plusMonths(i);				// Para a data inicia apartir de um mês
			
			double interest = onlinePaymentService.interest(basicQuota, i);				// Cálculo de juros para cada mês
			double fee = onlinePaymentService.paymentFee(basicQuota + interest); 
			double quota = basicQuota + interest + fee;
			
			contract.getInstalments().add(new Installment(dueDate, quota));
		}
	}
}
