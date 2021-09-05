package parker.learningJava;

public class Main {

    public static void main(String[] args) {
        System.out.println("100,000 at 2% interest =" + calculateInterest(10000,2));
    }
    public static double calculateInterest (double amount, double interestRate){
        return (amount * (interestRate/100));
    }
}
