package top.zhf.java.gui.judge;

import java.util.Scanner;

public class enter_the_information {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入会员生日（月/日<用两位数表示>）：");
        String b = sc.nextLine();
        System.out.println("请输入积分：");
        int c = sc.nextInt();

        System.out.println("请输入会员号（四位整数）：");
        int d = sc.nextInt();
        if (d <=9999 && d >= 1000) {
            System.out.println("已录入的会员信息是：");
            System.out.println(d);
            System.out.println(b);
            System.out.println(c);
        }else{
            System.out.println("客户号"+ d +"是无效会员号！");
            System.out.println("录入信息失败！");
        }
    }
}

