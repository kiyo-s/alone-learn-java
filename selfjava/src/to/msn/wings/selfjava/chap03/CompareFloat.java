package to.msn.wings.selfjava.chap03;

import java.math.BigDecimal;

public class CompareFloat {
    public static void main(String[] args) {
        System.out.println(0.2 * 3 == 0.6);

        var bd1 = new BigDecimal("0.2");
        var bd2 = new BigDecimal("3");
        var bd3 = new BigDecimal("0.6");

        System.out.println(bd1.multiply(bd2).compareTo(bd3) == 0);

        final double EPSILON = 0.00001;
        var x = 0.2 * 3;
        var y = 0.6;
        System.out.println(Math.abs(x - y) < EPSILON);
    }
}
