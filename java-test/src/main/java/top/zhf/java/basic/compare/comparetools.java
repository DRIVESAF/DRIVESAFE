package top.zhf.java.basic.compare;

public class comparetools {

    public static int compare(int args) {
        int max;
        int a = 12;
        int b = 34;
        int c = 20;
        if (a > b && a > c) {
            max = a;
        } else if (b > a && b > c) {
            max = b;
        } else {
            max = c;
        }
        return max;

    }
}

