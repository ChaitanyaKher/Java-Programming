public class ControlFlow {
    public static void main(String[] args) {
        System.out.println("10000 at 2% interest = "+calculateInterest(10000,2.0));
        System.out.println("10000 at 3% interest = "+calculateInterest(10000,3.0));
        System.out.println("10000 at 4% interest = "+calculateInterest(10000,4.0));
        System.out.println("10000 at 5% interest = "+calculateInterest(10000,5.0));
    }
    public static double calculateInterest(double amount, double interestRate){
        return (amount*(interestRate/100));
    }
}
