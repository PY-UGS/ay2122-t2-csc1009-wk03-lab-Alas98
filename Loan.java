import java.util.Date;
public class Loan

{
    private double annualInterestRate;
    private int numberofYears;
    private double loanAmount;
    private Date loanDate = new Date();

    public Loan(){
        this.annualInterestRate = 2.5;
        this.numberofYears = 1;
        this.loanAmount = 1000;
        this.loanDate = new Date(System.currentTimeMillis());
    }

    public Loan(double annualInterestRate, int numberofYears, double loanAmount){
        this.annualInterestRate = annualInterestRate;
        this.numberofYears = numberofYears;
        this.loanAmount = loanAmount;
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public int getNumberOfYears(){
        return numberofYears;
    }
    public double getLoanAmount(){
        return loanAmount;
    }
    public Date getLoanDate() {
        return loanDate;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    public void setNumberOfYears(int numberofYears){
        this.numberofYears = numberofYears;
    }
    public void setLoanAmount(double loanAmount){
        this.loanAmount = loanAmount;
    }


    public double getMonthlyPayment(){
       double up = this.loanAmount * (this.annualInterestRate/12)/100;
       double down = (1 - (1 / (Math.pow((1 + (this.annualInterestRate/12)/100), (this.numberofYears * 12)))));
       return (up/down);
    }

    public double gettotalPayment(){
        return this.getMonthlyPayment() * this.numberofYears * 12;
    }
}


