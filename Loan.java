public class Loan{
    private double principal;
    private double annualROI;
    private int tenure; // Months

    //Constructor
    public Loan(double principal, double ROI, int tenure){
        this.principal=principal;
        this.annualROI=ROI;
        this.tenure=tenure;
    }

    // Funtion for calculating monthly EMI
    public double calculateMonthlyEMI(){
        double monthlyROI= annualROI/12/100;
        return ( principal*monthlyROI*Math.pow(1+monthlyROI, tenure))/(Math.pow(1+monthlyROI,tenure)-1);
    }
    //Function to calculate total repayment of the loan based on the tenure
    public double calculateTotalRepayment(){
        return calculateMonthlyEMI()* tenure;
    }

    // Function to calculate the total interest by subtracting th eprincipal amount from the total repay amount
    public double calculateTotalInterest(){
        return calculateTotalRepayment()-principal;
    }

}