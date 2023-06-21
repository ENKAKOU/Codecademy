package java_english.access;

public class Bank2 {
    private CheckingAccount accountOne;
    private CheckingAccount accountTwo;

    public Bank2() {
        accountOne = new CheckingAccount("Zeus", 100, "1");
        accountTwo = new CheckingAccount("Hades", 200, "2");
    }

    public static void main(String[] args) {
        Bank2 bankOfGods = new Bank2();
        System.out.println(bankOfGods.accountOne.getName());
        bankOfGods.accountOne.addFunds(5);
        bankOfGods.accountOne.getInfo();
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

        public String getName() {
            return name;
        }

        public double getBalance() {
            return balance;
        }

        public void addFunds(double amount) {
            balance += amount;
        }

        public void getInfo() {
            System.out.println("Account Name: " + name);
            System.out.println("Account Balance: " + balance);
            System.out.println("Account Number: " + accountNumber);
        }
    }
}
