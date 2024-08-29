package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Enter com os dados do contrato (Enter the contract details): ");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.print("Contract Price: ");
		double totalValue = sc.nextDouble();
		
		Contract obj = new Contract(number, date, totalValue);					// Depois de ter todas as váriáveis, criamos o nosso contrato e instânciamos os objetos
		
		System.out.print("Number of installments: ");
		int n = sc.nextInt();
	
		ContractService contractService = new ContractService(new PaypalService());
		
		contractService.processContract(obj, n);
		
		System.out.println("Parcelas: ");
		for (Installment installment : obj.getInstalments()) {
			System.out.println(installment);
		}
		
		sc.close();
	}
}
