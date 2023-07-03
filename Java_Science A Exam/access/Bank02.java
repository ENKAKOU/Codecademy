public class Bank02 {
    private CheckingAccount accountOne;
    private CheckingAccount accountTwo;

    public Bank()02 {
        accountOne = new CheckingAccount("Zeus", 100, "1");
        accountTwo = new CheckingAccount("Hades", 200, "2");
    }

    public static void main(String[] args){

        Bank bankOfGods = new Bank();
        System.out.println(bankOfGods.accountOne.name);
        bankOfGods.accountOne.addFunds(5);
        bankOfGods.accountOne.getInfo();

    }
}