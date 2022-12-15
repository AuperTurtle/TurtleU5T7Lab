public class Main {
    public static void main(String[] args) {

    //K
    double mph = 10;
    double knots = Conversion.mphToKnot(mph);
    System.out.println(knots);
    Conversion.timeToTravelK(mph, 500);
    System.out.println("");

    //L
    double usd = 50;
    double euro = Money.USDtoEuro(usd);
    System.out.println(euro);
    Money.travelCostK(mph);
    System.out.println("");

    //M
    Money money = new Money(1000);
    money.addMoney(50);
    System.out.println(money.getMoney());
    money.removeMoney(25);
    System.out.println(money.getMoney());
    money.spendTravel(mph);
    System.out.println(money.getMoney());
    System.out.println(money.returnEuro());




    }

    //B
    public static void timeToTravelM(double knots, int distance) {
        double mph = Conversion.knotToMPH(knots);
        double time = distance / mph;

        System.out.println("It takes " + time + " hours to travel " + mph + " miles");
    }
}
