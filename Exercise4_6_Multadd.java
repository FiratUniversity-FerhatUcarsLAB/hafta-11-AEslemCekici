public class Multadd {

    // a * b + c
    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }


    public static double expSum(double x) {

        return multadd(x, Math.exp(-x), 1.0 - Math.exp(-x));
    }

    public static void main(String[] args) {

        //  (1 * 2) + 3
        System.out.println(multadd(1.0, 2.0, 3.0));

        //  cos * 0.5 + sin
        System.out.println(multadd(Math.cos(Math.PI / 4), 0.5, Math.sin(Math.PI / 4)));

        //  1.0 * log10 + log20
        System.out.println(multadd(1.0, Math.log(10), Math.log(20)));

        //  expSum fonksiyonu (x = 2.0 için)
        System.out.println(expSum(2.0));
    }
}
