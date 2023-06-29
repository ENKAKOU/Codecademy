package java_english.access;

public class Bank3 {
    private CheckingAccount accountOne;
    private CheckingAccount accountTwo;

    public Bank3() {
        accountOne = new CheckingAccount("Zeus", 100, "1");
        accountTwo = new CheckingAccount("Hades", 200, "2");
    }

    public static void main(String[] args) {
        Bank3 bankOfGods = new Bank3();
        System.out.println(bankOfGods.accountOne.getBalance());
        bankOfGods.accountOne.setBalance(5000);
        System.out.println(bankOfGods.accountOne.getBalance());
    }

    private class CheckingAccount {
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

        public void setBalance(double balance) {
            this.balance = balance;
        }
    }
}
