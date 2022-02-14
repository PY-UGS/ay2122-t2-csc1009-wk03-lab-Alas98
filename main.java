import java.util.Scanner;

public class main {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter annual interest rate, for example 8.25: ");
        double interestRate = input.nextDouble();

        System.out.println("Enter number of years as an integer: ");
        int numberofYears = input.nextInt();

        System.out.println("Enter the loan amount, for example 120000.95: ");
        double loanAmount = input.nextDouble();
        input.close();

        Loan loan = new Loan(interestRate,numberofYears,loanAmount);

        System.out.println("The loan was created on " + loan.getLoanDate());
        System.out.printf("The monthly payment is %.2f \n ", loan.getMonthlyPayment());
        System.out.printf("The total payment is %.2f ", loan.gettotalPayment());
    }
}
