package top.zhf.java.gui.skip;

import java.util.Scanner;

public class enter {
    public static void main(String[] args){
        System.out.println("欢迎使用MyShopping管理系统\n************************");
        System.out.println("1.客户信息管理\n2.购物结算\n3.真情回馈\n4.注销\n************************\n请输入选择数字：");
        while(true){
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            if (number ==1|number ==2|number ==3|number ==4){
                switch (number) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        System.out.println("执行客户信息管理");
                        break;
                }
                break;
            }else{
                System.out.println("输入错误，请重新输入：");
            }

        }
    }
}
