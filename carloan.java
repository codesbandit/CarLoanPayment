 public class CarLoan {
   public static void main(String[] args) {

//CarLoan Payment Calculator
     int carLoan = 10000;
     int loanLength = 3; //Represent 3 years
     int interestRate = 5; //Represent 5%
     int downPayment = 2000;

     if(loanLength < 0 || interestRate < 0){
       System.out.println("Error! You must take out a valid car loan");
     }else if(downPayment  > carLoan){
       System.out.println("The car can be paid in full");
     }else{
       int remainingBalance = carLoan - downPayment;
       int months = loanLength * 12;
       int monthlyBalance = remainingBalance / months;
       int interest = monthlyBalance * interestRate / 100;
       int monthlyPayment = monthlyBalance + interest;
       System.out.println("Your Monthly Payment is = " + monthlyPayment);
    }
	}
}
