public class Conversion {

    private Conversion() {}


    public static double mphToKnot(double mph) {
        return mph / 1.151;
    }


    public static double knotToMPH(double knot) {
        return knot * 1.151;
    }

    //A
    public static void timeToTravelK(double mphs, double distance) {
        double knots = mphToKnot(mphs);
        double time = distance / knots;

        System.out.println("It takes " + time + " hours to travel " + knots + " knots");
    }
}