package java_english.access;

public class ATM4 {
    public static int totalMoney = 0;
    public static int numATMs = 0;
    public int money;

    public ATM4(int inputMoney) {
        this.money = inputMoney;
        numATMs += 1;
        totalMoney += inputMoney;
    }

    public void withdrawMoney(int amountToWithdraw) {
        if (amountToWithdraw <= this.money) {
            this.money -= amountToWithdraw;
            totalMoney -= amountToWithdraw;
        }
    }

    public static void averageMoney() {
        System.out.println(totalMoney / numATMs);
    }

    public static void main(String[] args) {
        System.out.println("Total number of ATMs: " + ATM4.numATMs);
        ATM4 firstATM = new ATM4(1000);
        ATM4 secondATM = new ATM4(500);
        System.out.println("Total number of ATMs: " + ATM4.numATMs);

        System.out.println("Total amount of money in all ATMs: " + ATM4.totalMoney);
        firstATM.withdrawMoney(500);
        secondATM.withdrawMoney(200);
        System.out.println("Total amount of money in all ATMs: " + ATM4.totalMoney);

        ATM4.averageMoney();

    }
}
