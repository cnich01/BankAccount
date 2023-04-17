public class Account {
    public static double savings = 85;
    public static double checking = 275.45;

    public static void main(String[] args){
        displayBalance();
        deposit(283,84);
        deposit(193,843);
        withdraw(45,75.45);
        deposit(88,184);
        deposit(433,383);
        withdraw(200,73);
        deposit(293,192);
    }

    public static void deposit(double savingsAmt, double checkingAmt){
        savings += savingsAmt;
        checking += checkingAmt;
        displayBalance();
    }

    public static void withdraw(double savingsAmt, double checkingAmt){
        savings -= savingsAmt;
        checking -= checkingAmt;
        displayBalance();
    }

    public static void displayBalance(){
        System.out.println("Savings Balance: $" + savings);
        System.out.println("Checking Balance: $" + checking +"\n");
    }
}
