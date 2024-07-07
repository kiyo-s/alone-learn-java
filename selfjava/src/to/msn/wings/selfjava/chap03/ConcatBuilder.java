package to.msn.wings.selfjava.chap03;

public class ConcatBuilder {
    public static void main(String[] args) {
        var builder = new StringBuilder();
        for (var i = 0; i < 100_000; i++) {
            builder.append("いろは");
        }
        var result = builder.toString();
    }
}
