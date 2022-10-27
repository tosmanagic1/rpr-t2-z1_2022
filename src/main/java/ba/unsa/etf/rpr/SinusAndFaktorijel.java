package ba.unsa.etf.rpr;

public class SinusAndFaktorijel {

    public static double sinus(double x) {
        double sinus = Math.sin(x);
        return sinus;
    }
    public static double faktorijel (double n) {

        if (n < 0 || (n - (int)(n)) != 0) {
            throw new IllegalArgumentException("Nelegalan argument za faktorijel!");
        }
        double faktorijel = 1;
        for (int i = 1; i <= n; i++) {
            faktorijel *= i;
        }
        return faktorijel;
    }
}
