package java_english.access;

public class Bank4 {
    private CheckingAccount accountOne;
    private CheckingAccount accountTwo;

    public Bank4() {
        this.accountOne = new CheckingAccount("Zeus", 100, "1");
        this.accountTwo = new CheckingAccount("Hades", 200, "2");
    }

    public static void main(String[] args) {
        Bank4 bankOfGods = new Bank4();
        bankOfGods.accountOne.getAccountInformation();
        bankOfGods.accountOne.calculateNextMonthInterest();
    }

    private static class CheckingAccount {
        private String name;
        private double balance;
        private String accountNumber;

        public CheckingAccount(String name, double balance, String accountNumber) {
            this.name = name;
            this.balance = balance;
            this.accountNumber = accountNumber;
        }

        public void getAccountInformation() {
            System.out.println("Account Name: " + name);
            System.out.println("Account Balance: " + balance);
            System.out.println("Account Number: " + accountNumber);
        }

        public void calculateNextMonthInterest() {
            double interest = balance * 0.05; // Assuming 5% interest rate
            System.out.println("Next month's interest: " + interest);

        }
    }
}
