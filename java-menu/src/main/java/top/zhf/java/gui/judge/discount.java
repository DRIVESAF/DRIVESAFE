package top.zhf.java.gui.judge;

import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入是否为会员：是（y）/否（n）");
        String shifou = sc.next();
        System.out.println("请输入购物金额：");
        int jine = sc.nextInt();
        if (shifou.equals("y")) {
            if (jine >= 200){
                System.out.println("实际支付：" + jine * 0.75);
            }else{
                System.out.println("未达到折扣要求");
            }
        }else if (jine >= 100){
            System.out.println("实际支付：" + jine * 0.9);
        }else {
            System.out.println("未达到折扣要求");
        }
    }
}

