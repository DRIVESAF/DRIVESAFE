package top.zhf.java.gui.skip;

import java.util.Scanner;

public class exchange {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入消费金额：");
            int bh = sc.nextInt();
            System.out.println("是否参加优惠换购活动：\n1.满50元，加2元换购百事可乐饮料1瓶\n2.满100元，加3元换购500ml可乐1瓶");
            System.out.println("3.满100元，加10元换购5公斤面粉\n4.满200元，加10元可换购1个苏波尔炒菜锅\n5.满200元，加20元可换购欧莱雅爽肤水一瓶");
            System.out.println("0.不换购\n请选择：");
            int al = sc.nextInt();
            if (al > 0){
                switch (al) {
                    case 1:
                        System.out.println(" 本次消费总金额：" + (bh+2) +"\n成功换购：500ml可乐一瓶。");
                        break;
                    case 2:
                        System.out.println(" 本次消费总金额：" + (bh+3) +"\n成功换购：500ml可乐1瓶");
                        break;
                    case 3:
                        System.out.println(" 本次消费总金额：" + (bh+10) +"\n成功换购：5公斤面粉");
                        break;
                    case 4:
                        System.out.println(" 本次消费总金额：" + (bh+10) +"\n成功换购：1个苏波尔炒菜锅");
                        break;
                    case 5:
                        System.out.println(" 本次消费总金额：" + (bh+20) +"\n成功换购：欧莱雅爽肤水一瓶");
                        break;
                }
            }else{
                System.out.println("本次消费总金额：" + bh);
            }
        }

    }
