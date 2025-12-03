public class Multadd {


    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }


    public static double expSum(double x) {
        return multadd(x, Math.exp(-x), 1.0 - Math.exp(-x));
    }

    public static void main(String[] args) {


        System.out.println(" multadd(1, 2, 3) sonucu: " + multadd(1.0, 2.0, 3.0));

      // Trigonometri
        System.out.println(" sin(pi/4) + cos(pi/4)/2 sonucu: " +
                multadd(Math.cos(Math.PI / 4), 0.5, Math.sin(Math.PI / 4)));

       // Logaritma
        System.out.println(" log(10) + log(20) sonucu: " +
                multadd(1.0, Math.log(10), Math.log(20)));


        System.out.println(" expSum(2.0) sonucu: " + expSum(2.0));
    }
}

/*
multadd(1, 2, 3) sonucu: 5.0
sin(pi/4) + cos(pi/4)/2 sonucu: 1.0606601717798212
log(10) + log(20) sonucu: 5.298317366548037
expSum(2.0) sonucu: 1.1353352832366128

*/

