package to.msn.wings.selfjava.chap03;

public class Increment {
    public static void main(String[] args) {
        int i = 3;
        var j = ++i;
        System.out.println(i);
        System.out.println(j);

        i++;
        System.out.println(i);
        System.out.println(j);

        int m = 3;
        var n = m++;
        System.out.println(n);
        System.out.println(m);
    }
}
