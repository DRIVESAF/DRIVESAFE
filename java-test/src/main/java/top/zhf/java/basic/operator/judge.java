package top.zhf.java.basic.operator;

import java.util.Scanner;

public class judge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输出互换前手中的纸牌：");
        System.out.println("左手中的纸牌：");
        int first = sc.nextInt();
        System.out.println("右手中的纸牌：");
        int second = sc.nextInt();
        int third = first;
        first = second;
        second = third;
        System.out.println("输出互换后手中的纸牌：");
        System.out.println("左手中的纸牌：" + first);
        System.out.println("右手中的纸牌：" + second);
    }
}
