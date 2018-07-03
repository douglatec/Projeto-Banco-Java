package br.com.banco.util;

import java.util.Locale;
import java.util.Scanner;

import br.com.banco.entities.ContaBancaria;

public class Tela {

	public static void dadosAbrtuaConata () {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter account holder: ");
		String holder = sc.next();
		sc.nextLine();
		
		System.out.print("Is there na initial depsoit? ");
		String str = sc.next();
		sc.nextLine();	
		
		
		
		if(str.equals("y")) {			
			System.out.print("Enter initial deposit value: ");
			double deposit = sc.nextDouble();
			
			ContaBancaria cta = new ContaBancaria(number,holder,deposit);
			System.out.println(cta);
			sc.nextLine();
			
			System.out.print("Enter a deposit value: ");
			double depositValue = sc.nextDouble();	
			cta.deposit(depositValue);
			System.out.println(cta);
			sc.nextLine();
			
			System.out.print("Enter a withdraw value: ");
			double withdrawValue = sc.nextDouble();	
			cta.withdraw(withdrawValue);
			System.out.println(cta);			
			
		}
		else {			
			ContaBancaria cta = new ContaBancaria(number,holder);
			System.out.println(cta);
			sc.nextLine();
			
			System.out.print("Enter a deposit value: ");
			double depositValue = sc.nextDouble();	
			cta.deposit(depositValue);
			System.out.println(cta);
			sc.nextLine();
			
			System.out.print("Enter a withdraw value: ");
			double withdrawValue = sc.nextDouble();	
			cta.withdraw(withdrawValue);
			System.out.println(cta);
			
		}	
		
		
		sc.close();
		
	}
	
	
	
}
