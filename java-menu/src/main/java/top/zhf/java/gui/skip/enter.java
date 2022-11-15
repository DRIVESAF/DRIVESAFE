package top.zhf.java.gui.skip;

import java.util.Scanner;

    public class enter {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("欢迎使用购物系统：\n1.登陆系统\n2.退出\n*********************\n请输入选择数字：");
            int bh = sc.nextInt();
            switch (bh) {
                case 1:
                    System.out.println("购物管理系统：\n1.客户信息管理\n2.购物结算\n3.真情回馈\n4.注销\n*********************\n请输入选择数字:");
                    int dr = sc.nextInt();
                    switch (dr){
                        case 1:
                            System.out.println("购物管理系统>客户信息管理：\n1.显示所有客户信息\n2.添加客户信息\n3.修改客户信息\n4.查询客户信息");
                            break;
                        case 3:
                            System.out.println("购物管理系统>真情回馈：\n1.幸运大放送\n2.幸运抽奖\n3.生日问候");
                    }
                    break;
                case 2:
                    System.out.println("已退出。");
                    break;
            }
        }
    }
