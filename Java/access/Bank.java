package java_english.access;

public class Bank {
    private CheckingAccount accountOne;
    private CheckingAccount accountTwo;

    public Bank() {
        accountOne = new CheckingAccount("Zeus", 100);
        accountTwo = new CheckingAccount("Hades", 200);
    }

    public static void main(String[] args) {
        Bank bankOfGods = new Bank();
        System.out.println(bankOfGods.accountOne.getName());
        System.out.println(bankOfGods.accountOne.getBalance());
    }
}

class CheckingAccount {
    private String name;
    private double balance;

    public CheckingAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
}
