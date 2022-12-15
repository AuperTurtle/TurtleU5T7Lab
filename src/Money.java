public class Money {
    public double balance;
    private int moneyModify;

    public Money(double balance) {
        this.balance = balance;
    }

    public Money() {
        this.balance = 0;
    }

    //E
    public void addMoney(double money) {
        moneyModify = 1;
        modifyMoney(money);
    }

    //E
    public void removeMoney(double money) {
        moneyModify = 2;
        modifyMoney(money);
    }

    //F
    private void modifyMoney(double money) {
        if (moneyModify == 1) {
            balance += money;
        }  else  {
            balance -= money;
        }
    }

    public static double USDtoEuro(double usd) {
        return usd * 0.94;
    }

    //G
    public double returnEuro() {
        return USDtoEuro(balance);
    }

    //H
    public void spendTravel(double mph) {
        double cost = Conversion.mphToKnot(mph) * 5;
        balance -= cost;
    }

    //J
    public static void travelCostK(double mph) {
        double distanceK = Conversion.mphToKnot(mph);
        double cost = distanceK * 5;
        System.out.println("It costs $" + cost + " dollars to travel " + distanceK + " knots per hour");
    }

    public double getMoney() {
        return balance;
    }
}