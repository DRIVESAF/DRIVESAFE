package top.zhf.java.gui.print;

import java.util.Scanner;

public class count {
        public static void main(String[]args){
            double money;
            double nextmony;
            Scanner inout = new Scanner(System.in);
            System.out.println("消费总金额：");
            money = inout.nextDouble();
            nextmony = money * 0.8;
            System.out.println("优惠后的价格为：" + nextmony);
        }
    }

