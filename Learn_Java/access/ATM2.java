package java_english.access;

public class ATM2{

    public static int totalMoney = 0;
    public static int numATMs = 0;
    public int money;

    public ATM2(int inputMoney){
        this.money = inputMoney;

        numATMs += 1;
        totalMoney += inputMoney;
    }

    public void withdrawMoney(int amountToWithdraw){
        if(amountToWithdraw <= this.money){
            this.money -= amountToWithdraw;
            totalMoney -= amountToWithdraw;
        }
    }

    public static void main(String[] args){

        System.out.println("Total number of ATMs: " + ATM2.numATMs);
        ATM2 firstATM = new ATM2(1000);
        ATM2 secondATM = new ATM2(500);
        System.out.println("Total number of ATMs: " + ATM2.numATMs);

        System.out.println("Total amount of money in all ATMs: " + ATM2.totalMoney);
        firstATM.withdrawMoney(500);
        secondATM.withdrawMoney(200);
        System.out.println("Total amount of money in all ATMs: " + ATM2.totalMoney);

    }
}