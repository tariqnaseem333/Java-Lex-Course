package ControlStructures;

import java.util.Scanner;

public class MetroBankLoan {

	public static void main(String[] args) {
		
		int eligibleLoanAmount = 0;
		int eligibleEMINo = 0;
		
		Scanner s = new Scanner(System.in);
		
//		Getting input of Account Number and Validating it
		System.out.println("Enter the Account Number: ");
		int accNo = s.nextInt();
		while( true ) {
			if( accNo < 1000 || accNo > 1999 ) {
				System.out.println("Enter a Valid Account Number: ");
				accNo = s.nextInt();
				continue;
			} else {
				break;
			}
		}
		
//		Getting input of Account Balance and Validating it
		System.out.println("Enter the Account Balance: ");
		int accBal = s.nextInt();
		while( true ) {
			if( accBal < 1000 ) {
				System.out.println("Sorry, You are not Eligible for Loan");
				return;
			} else {
				break;
			}
		}
		
		System.out.println("Enter the Monthly Salary: ");
		int salary = s.nextInt();
		
		System.out.println("Enter the Loan Type you want to avail: ");
		String loanType = s.next();
		
		System.out.println("Enter the Expected Loan Amount: ");
		int loanAmount = s.nextInt();
		
		System.out.println("Enter the Expected no. of  EMIs: ");
		int EMINo = s.nextInt();
		
		if( loanType.equals("Car") && ( salary > 25000 && salary < 50000 ) ) {
			eligibleLoanAmount = 500000;
			eligibleEMINo = 36;
		}
		
		if( loanType.equals("House") && ( salary > 50000 && salary < 75000 ) ) {
			eligibleLoanAmount = 6000000;
			eligibleEMINo = 60;
		}
		
		if( loanType.equals("Business") && ( salary > 75000 ) ) {
			eligibleLoanAmount = 7500000;
			eligibleEMINo = 84;
		}
		
		if( eligibleLoanAmount > loanAmount && eligibleEMINo > EMINo ) {
			System.out.println("Eligible Loan Amount: " + eligibleLoanAmount);
			System.out.println("Eligible EMI No. : " + eligibleEMINo);
		} else {
			System.out.println("Sorry, You are not Eligible for Loan");
			System.out.println(eligibleLoanAmount + " " + eligibleEMINo);
		}
		
	}

}
