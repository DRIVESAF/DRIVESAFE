package top.zhf.java.gui.judge;

import java.util.Scanner;

public class lucky_user {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("请输入四位卡号：");
            int a = input.nextInt();
            int b = a / 1000;
            int c = a % 1000 / 100;
            int d = a % 1000 % 100 / 10;
            int e = a % 1000 % 100 % 10;
            int f = b + c + d + e;
            System.out.print("会员卡号" + a + "各位数之和：" + f);
            System.out.print("是幸运用户吗？");
            if (f > 28) {
                System.out.print("true");
            }else{
                System.out.print("false");
            }
        }
}
