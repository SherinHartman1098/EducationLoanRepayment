import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println(" =====Educational Loan Repayment Calculator====");

        System.out.println("Enter the principal loan amount: ");
        double principal= sc.nextDouble();

        System.out.println("Enter the annual Rate of Interest % : ");
        double annualROI= sc.nextDouble();

        System.out.println("Enter the loan tenure in months: ");
        int tenure= sc.nextInt();

        //creating the object of class Loan

        Loan loan= new Loan(principal, annualROI, tenure);

        double emi= loan.calculateMonthlyEMI();
        double totalRepayment= loan.calculateTotalRepayment();
        double totalInterest= loan.calculateTotalInterest();

        System.out.printf("\n ---- Educational Loan Summary --- \n");
        System.out.printf("Monthly EMI: %.2f\n", emi);
        System.out.printf("Total Repayment Amount: %.2f\n",totalRepayment);
        System.out.printf("Total Interets Paid: %.2f \n", totalInterest);
    
        sc.close();

    }
}