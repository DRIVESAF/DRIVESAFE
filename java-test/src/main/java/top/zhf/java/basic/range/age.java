package top.zhf.java.basic.range;

import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        Scanner x =new Scanner(System.in);
        System.out.println("顾客数量：");
        int s=x.nextInt();
        int c=0;
        int d=0;
        int a=1;
        for (a=1;a<=s;a++) {
            System.out.println("请输入第" + a + "位顾客的年龄：");
            int b = x.nextInt();
            if (b < 30) {
                c++;
            } else {
                d++;
            }
        }
        System.out.println("30岁以下的比例是:"+c/a);
        System.out.println("30岁以上的比例是："+d/a);
    }
}

