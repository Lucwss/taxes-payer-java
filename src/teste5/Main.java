package teste5;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		List<Payer> payers = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		Integer length = input.nextInt();
		
		for(int i = 0; i < length; i++) {
			System.out.printf("Tax Payer #%d data: \n", i+1);
			System.out.print("Individual or company (i/c)? ");
			Character choice = input.next().charAt(0);
			System.out.print("Name: ");
			input.nextLine();
			String name = input.nextLine();
			System.out.print("Anual income: ");
			Double anualIncome = input.nextDouble();
			if(choice == 'i') {
				System.out.print("Health Cares: ");
				Double healthCares = input.nextDouble();
				payers.add(new Individual(name, anualIncome, healthCares));
			}
			else {
				System.out.print("Number of employees: ");
				Integer numberOfEmployees = input.nextInt();
				payers.add(new Company(name, anualIncome, numberOfEmployees));
			}
			breakLine();
		}
		
		viewList(payers);
		
		breakLine();
		
		viewTotal(payers);
		
		input.close();
	}
	
	public static void breakLine() {
		System.out.println();
	}
	
	public static void viewList(List<Payer> payers) {
		System.out.println("TAXES PAID:");
		for(Payer payer: payers) {
			System.out.println(payer.getName() + " $ " + String.format("%.2f", payer.taxPaymemt()));
		}
	}
	
	public static void viewTotal(List<Payer> payers) {
		Double total = 0.0;
		for(Payer payer: payers) {
			total += payer.taxPaymemt();
		}
		System.out.printf("TOTAL TAXES: $ %.2f" , total);
	}
}
