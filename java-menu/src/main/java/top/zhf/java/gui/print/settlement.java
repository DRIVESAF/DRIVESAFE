package top.zhf.java.gui.print;

import java.util.Scanner;

public class settlement {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("请选择购买的商品编号：");
        System.out.println("1.T恤\t\t\t2.网球鞋\t\t\t3.网球拍");
        System.out.println("*********************************************");
        int a=0;
        int b=0;
        char c='y';
        double t=0;
        while (c=='y') {
            System.out.println("请输入商品编号：");
            a = x.nextInt();
            System.out.println("请输入商品数量：");
            b = x.nextInt();
            switch (a) {
                case 1:
                    System.out.println("T恤￥245.0\t数量" + b + "合计￥" + b * 245);
                    t+=b*245;
                    break;
                case 2:
                    System.out.println("网球鞋￥1000。0\t数量" + b + "合计￥" + b * 1000);
                    t+=b*1000;
                    break;
                case 3:
                    System.out.println("网球拍￥320.0\t数量" + b + "合计￥" + b * 320);
                    t+=b*320;
                    break;
            }
            System.out.println("是否继续（y/n）");
            String d = x.next();
            c = d.charAt(0);
        }
        double z=0.8;
        System.out.println("应付金额："+t*0.8);
        System.out.println("实付金额："+t);
        System.out.println("找钱："+0.2*t);
    }
}
